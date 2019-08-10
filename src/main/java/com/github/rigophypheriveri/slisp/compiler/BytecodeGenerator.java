package com.github.rigophypheriveri.slisp.compiler;

import com.github.rigophypheriveri.slisp.compiler.instructions.node.Node;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class BytecodeGenerator implements Opcodes {
    public byte[] generateBytecode(Node node, String name) {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(52, ACC_PUBLIC + ACC_SUPER, name, null, "java/lang/Object", null);
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
        node.apply(mv);
        mv.visitInsn(RETURN);
        mv.visitMaxs(100, 100);
        mv.visitEnd();
        cw.visitEnd();
        return cw.toByteArray();
    }
}
