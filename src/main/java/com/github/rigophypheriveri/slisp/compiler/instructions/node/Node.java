package com.github.rigophypheriveri.slisp.compiler.instructions.node;

import com.github.rigophypheriveri.slisp.compiler.NotSupportCompare;
import com.github.rigophypheriveri.slisp.compiler.instructions.Instruction;
import com.github.rigophypheriveri.slisp.compiler.instructions.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public abstract class Node implements Instruction, Opcodes {
    protected Type type = Type.VOID;

    public Node(Type type) {
        this.type = type;
    }

    public Node() {
    }

    public Type getType() {
        return type;
    }

    void resultToIf(MethodVisitor methodVisitor, Label label) {
        throw new NotSupportCompare();
    }
}
