package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class ConstBoolean extends Node {
    private boolean value;

    public ConstBoolean(boolean value) {
        this.value = value;
        type = Type.BOOL;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        methodVisitor.visitIntInsn(BIPUSH, value ? 1 : 0);
    }

    @Override
    void resultToIf(MethodVisitor methodVisitor, Label label) {
        apply(methodVisitor);
        methodVisitor.visitJumpInsn(IFEQ, label);
    }
}
