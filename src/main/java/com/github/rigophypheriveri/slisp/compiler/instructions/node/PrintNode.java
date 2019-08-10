package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.MethodVisitor;

public class PrintNode extends Node {
    private Node node;

    public PrintNode(Node node) {
        this.node = node;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        node.apply(methodVisitor);
        Type type = node.getType();
        if (type == Type.INT) {
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
        } else if (type == Type.STRING){
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        } else if (type == Type.BOOL) {
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Z)V", false);
        }
    }
}
