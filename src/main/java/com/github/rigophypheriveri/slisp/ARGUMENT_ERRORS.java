package com.github.rigophypheriveri.slisp;

public enum ARGUMENT_ERRORS {
    NONE (""),
    NO_FILE ("Specify files for compilation"),
    BAD_FILE_EXTENSION ("File has to end with .slisp extension");

    private String message;

    ARGUMENT_ERRORS(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
