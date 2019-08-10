package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.CompareSign;
import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class Compare extends Node {
    private CompareSign compareSign;
    private Node trueBranch;
    private Node falseBranch;


    public Compare(String sign, Node trueBranch, Node falseBranch) {
        this.compareSign = CompareSign.fromString(sign);
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
        type = Type.BOOL;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        trueBranch.apply(methodVisitor);
        falseBranch.apply(methodVisitor);
    }

    @Override
    void resultToIf(MethodVisitor methodVisitor, Label label) {
        apply(methodVisitor);
        methodVisitor.visitJumpInsn(compareSign.getOpcode(), label);
    }
}
