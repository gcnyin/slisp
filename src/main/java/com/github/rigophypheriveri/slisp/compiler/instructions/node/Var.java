package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.MethodVisitor;

public class Var extends Node {
    private Integer index;

    public Var(Integer index, Type type) {
        this.index = index;
        this.type = type;
    }

    public Integer getIndex() {
        return index;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        if (type == Type.INT) {
            methodVisitor.visitVarInsn(ILOAD, index);
        } else if (type == Type.STRING) {
            methodVisitor.visitVarInsn(ALOAD, index);
        } else if (type == Type.BOOL) {
            methodVisitor.visitVarInsn(ILOAD, index);
        }
    }

    @Override
    public String toString() {
        return "Var{" +
                "index=" + index +
                ", type=" + type +
                '}';
    }
}
