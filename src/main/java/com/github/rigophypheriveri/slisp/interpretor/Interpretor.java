package com.github.rigophypheriveri.slisp.interpretor;

import com.github.rigophypheriveri.slisp.antlr.SlispLexer;
import com.github.rigophypheriveri.slisp.antlr.SlispParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpretor {
    public void eval(String text) {
        ANTLRInputStream input = new ANTLRInputStream(text);
        SlispLexer lexer = new SlispLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SlispParser parser = new SlispParser(tokens);
        ParseTree program = parser.program();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(program);
    }
}
