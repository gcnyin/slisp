package com.github.rigophypheriveri.slisp.compiler.instructions.node.binary;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Node;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Var;
import org.objectweb.asm.MethodVisitor;

public class DefineVar extends BinaryNode {
    private Var var;
    private Node node;

    public DefineVar(Var var, Node node) {
        this.var = var;
        this.node = node;
        type = Type.INT;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        node.apply(methodVisitor);
        if (node.getType() == Type.INT) {
            methodVisitor.visitVarInsn(ISTORE, var.getIndex());
        } else if (node.getType() == Type.STRING) {
            methodVisitor.visitVarInsn(ASTORE, var.getIndex());
        } else if (node.getType() == Type.BOOL) {
            methodVisitor.visitVarInsn(ISTORE, var.getIndex());
        }
    }
}
