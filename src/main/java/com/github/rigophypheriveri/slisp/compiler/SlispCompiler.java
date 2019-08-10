package com.github.rigophypheriveri.slisp.compiler;

import com.github.rigophypheriveri.slisp.ARGUMENT_ERRORS;
import com.github.rigophypheriveri.slisp.compiler.instructions.node.Node;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SlispCompiler implements Opcodes {
    public static final String SOURCE_FILE_POSTFIX = ".slisp";

    public static void main(String[] args) throws IOException {
        new SlispCompiler().compile(args);
    }

    private void compile(String[] args) throws IOException {
        final ARGUMENT_ERRORS argumentsErrors = getArgumentValidationErrors(args);
        if (argumentsErrors != ARGUMENT_ERRORS.NONE) {
            System.out.println(argumentsErrors.getMessage());
            return;
        }
        final File enkelFile = new File(args[0]);
        String fileName = enkelFile.getName();
        String fileAbsolutePath = enkelFile.getAbsolutePath();
        String className = fileName.replaceAll(SOURCE_FILE_POSTFIX, "");
        Node node = new SyntaxTreeTraverser().getCalculator(fileAbsolutePath);
        byte[] bytecode = new BytecodeGenerator().generateBytecode(node, className);
        saveBytecodeToClassFile(fileName, bytecode);
    }

    private ARGUMENT_ERRORS getArgumentValidationErrors(String[] args) {
        if (args.length != 1) {
            return ARGUMENT_ERRORS.NO_FILE;
        }
        String filePath = args[0];
        if (!filePath.endsWith(SOURCE_FILE_POSTFIX)) {
            return ARGUMENT_ERRORS.BAD_FILE_EXTENSION;
        }
        return ARGUMENT_ERRORS.NONE;
    }

    private static void saveBytecodeToClassFile(String fileName, byte[] byteCode) throws IOException {
        String classFile = fileName.replaceAll(SOURCE_FILE_POSTFIX, ".class");
        try (OutputStream os = new FileOutputStream(classFile)) {
            os.write(byteCode);
        }
    }
}
