package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.MethodVisitor;

public class ConstInteger extends Node {
    private int value;

    public ConstInteger(int value) {
        this.value = value;
        type = Type.INT;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        methodVisitor.visitIntInsn(BIPUSH, value);
    }
}
