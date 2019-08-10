package com.github.rigophypheriveri.slisp.compiler.instructions;

import org.objectweb.asm.MethodVisitor;

public interface Instruction {
    void apply(MethodVisitor methodVisitor);
}
