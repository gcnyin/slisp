package com.github.rigophypheriveri.slisp.compiler;

import com.github.rigophypheriveri.slisp.antlr.SlispBaseVisitor;
import com.github.rigophypheriveri.slisp.antlr.SlispParser;
import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Compare;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.ConstBoolean;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.ConstInteger;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.ConstString;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.If;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.LoadVar;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Node;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.PrintNode;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Var;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.binary.Addition;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.binary.DefineVar;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.binary.Division;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.binary.Multiplication;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.binary.Program;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.binary.Subtract;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeVisitor extends SlispBaseVisitor<Node> {
    private Map<String, Var> nameIndexMap = new HashMap<>();

    @Override
    public Node visitProgram(SlispParser.ProgramContext ctx) {
        return ctx.expression()
                .stream()
                .map(this::visit)
                .reduce(Program::new)
                .get();
    }

    @Override
    public Node visitASSIGN(SlispParser.ASSIGNContext ctx) {
        TerminalNode id = ctx.ID();
        String name = id.getText();
        SlispParser.ExpressionContext expression = ctx.expression();
        Node value = visit(expression);
        Type type = value.getType();
        Var var;
        boolean nameExists = nameIndexMap.containsKey(name);
        if (nameExists) {
            var = nameIndexMap.get(name);
        } else {
            int index = nameIndexMap.size() + 1;
            var = new Var(index, type);
            nameIndexMap.put(name, var);
        }
        return new DefineVar(var, value);
    }

    @Override
    public Node visitId(SlispParser.IdContext ctx) {
        TerminalNode id = ctx.ID();
        Var var = nameIndexMap.get(id.getText());
        return new LoadVar(var);
    }

    @Override
    public Node visitPRINT(SlispParser.PRINTContext ctx) {
        SlispParser.ExpressionContext expression = ctx.expression();
        Node node = visit(expression);
        return new PrintNode(node);
    }

    @Override
    public Node visitADD(SlispParser.ADDContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression
                .stream()
                .map(this::visit)
                .reduce(Addition::new)
                .get();
    }

    @Override
    public Node visitSUBTRACT(SlispParser.SUBTRACTContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression
                .stream()
                .map(this::visit)
                .reduce(Subtract::new)
                .get();
    }

    @Override
    public Node visitMULTI(SlispParser.MULTIContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression
                .stream()
                .map(this::visit)
                .reduce(Multiplication::new)
                .get();
    }

    @Override
    public Node visitDIVIDE(SlispParser.DIVIDEContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression
                .stream()
                .map(this::visit)
                .reduce(Division::new)
                .get();
    }

    @Override
    public Node visitIF(SlispParser.IFContext ctx) {
        Node condition = visit(ctx.expression(0));
        Node trueBranch = visit(ctx.expression(1));
        Node falseBranch = visit(ctx.expression(2));
        return new If(condition, trueBranch, falseBranch);
    }

    @Override
    public Node visitCOMPARE(SlispParser.COMPAREContext ctx) {
        String op = ctx.op.getText();
        Node trueBranch = visit(ctx.expression(0));
        Node falseBranch = visit(ctx.expression(1));
        return new Compare(op, trueBranch, falseBranch);
    }

    @Override
    public Node visitNumber(SlispParser.NumberContext ctx) {
        TerminalNode number = ctx.NUMBER();
        int integer = Integer.parseInt(number.getText());
        return new ConstInteger(integer);
    }

    @Override
    public Node visitString(SlispParser.StringContext ctx) {
        TerminalNode terminalNode = ctx.STRING_LITERAL();
        String text = terminalNode.getText().replaceAll("\"", "");
        return new ConstString(text);
    }

    @Override
    public Node visitBool(SlispParser.BoolContext ctx) {
        TerminalNode node = ctx.BOOL();
        String text = node.getText();
        boolean value = text.equals("true");
        return new ConstBoolean(value);
    }
}
