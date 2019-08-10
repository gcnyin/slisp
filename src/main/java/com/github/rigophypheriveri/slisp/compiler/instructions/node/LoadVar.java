package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import org.objectweb.asm.MethodVisitor;

public class LoadVar extends Node {
    private Var var;

    public LoadVar(Var var) {
        this.var = var;
        type = var.getType();
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        var.apply(methodVisitor);
    }


}
