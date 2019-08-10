package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class If extends Node {
    private Node condition;
    private Node trueBranch;
    private Node falseBranch;

    public If(Node condition, Node trueBranch, Node falseBranch) {
        this.condition = condition;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        if (condition.getType() != Type.BOOL) {
            throw new RuntimeException("condition is not bool type");
        }
        Label trueLabel = new Label();
        condition.resultToIf(methodVisitor, trueLabel);
        trueBranch.apply(methodVisitor);
        Label falseLabel = new Label();
        methodVisitor.visitJumpInsn(GOTO,falseLabel);
        methodVisitor.visitLabel(trueLabel);
        methodVisitor.visitFrame(F_SAME,0,null,0,null);
        falseBranch.apply(methodVisitor);
        methodVisitor.visitLabel(falseLabel);
        methodVisitor.visitFrame(F_SAME,0,null,0,null);
    }
}
