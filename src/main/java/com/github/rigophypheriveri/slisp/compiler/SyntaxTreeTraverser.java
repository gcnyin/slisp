package com.github.rigophypheriveri.slisp.compiler;

import com.github.rigophypheriveri.slisp.antlr.SlispLexer;
import com.github.rigophypheriveri.slisp.antlr.SlispParser;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Node;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class SyntaxTreeTraverser {
    public Node getCalculator(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath);
        SlispLexer lexer = new SlispLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SlispParser parser = new SlispParser(tokenStream);
        SlispParser.ProgramContext program = parser.program();
        return new NodeVisitor().visit(program);
    }
}
