package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.MethodVisitor;

public class ConstString extends Node {
    private String value;

    public ConstString(String value) {
        this.value = value;
        type = Type.STRING;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        methodVisitor.visitLdcInsn(value);
    }
}
