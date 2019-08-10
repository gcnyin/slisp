package com.github.rigophypheriveri.slisp.interpretor;

import com.github.rigophypheriveri.slisp.antlr.SlispBaseVisitor;
import com.github.rigophypheriveri.slisp.antlr.SlispParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends SlispBaseVisitor<Integer> {
    private Map<String, Variable> variables = new HashMap<>();

    @Override
    public Integer visitADD(SlispParser.ADDContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression.stream()
                .map(this::visit)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    @Override
    public Integer visitSUBTRACT(SlispParser.SUBTRACTContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression.stream()
                .map(this::visit)
                .mapToInt(Integer::valueOf)
                .reduce((a, b) -> a - b)
                .orElse(0);
    }

    @Override
    public Integer visitMULTI(SlispParser.MULTIContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression.stream()
                .map(this::visit)
                .mapToInt(Integer::valueOf)
                .reduce(1, (a, b) -> a * b);
    }

    @Override
    public Integer visitDIVIDE(SlispParser.DIVIDEContext ctx) {
        List<SlispParser.ExpressionContext> expression = ctx.expression();
        return expression.stream()
                .map(this::visit)
                .mapToInt(Integer::valueOf)
                .reduce((a, b) -> a / b)
                .orElse(1);
    }

    @Override
    public Integer visitNumber(SlispParser.NumberContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Integer visitPRINT(SlispParser.PRINTContext ctx) {
        Integer result = visit(ctx.expression());
        System.out.println(result);
        return 0;
    }

    @Override
    public Integer visitASSIGN(SlispParser.ASSIGNContext ctx) {
        TerminalNode id = ctx.ID();
        SlispParser.ExpressionContext expression = ctx.expression();
        Integer value = visit(expression);
        Token start = expression.getStart();
        Variable variable = new Variable(variables.size(), start.getType(), value);
        variables.put(id.getText(), variable);
        return value;
    }

    @Override
    public Integer visitId(SlispParser.IdContext ctx) {
        String id = ctx.getText();
        Variable variable = variables.get(id);
        return variable.getValue();
    }
}
