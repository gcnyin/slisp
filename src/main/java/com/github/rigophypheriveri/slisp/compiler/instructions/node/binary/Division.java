package com.github.rigophypheriveri.slisp.compiler.instructions.node.binary;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Node;
import org.objectweb.asm.MethodVisitor;

public class Division extends BinaryNode {
    public Division(Node node1, Node node2) {
        super(node1, node2);
        type = Type.INT;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        node1.apply(methodVisitor);
        node2.apply(methodVisitor);
        methodVisitor.visitInsn(IDIV);
    }
}
