package com.github.rigophypheriveri.slisp;

import com.github.rigophypheriveri.slisp.interpretor.Interpretor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InterpretorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final Interpretor interpretor = new Interpretor();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldPrintResult() {
        interpretor.eval("(println (+ (- 1 2) (* 3 4) (/ 4 2)))");
        assertEquals("13\n", outContent.toString());
    }

    @Test
    public void shouldPrintVariable() {
        String resource = "(define a (+ 1 2 3 4))" +
                "(println a)";
        interpretor.eval(resource);
        assertEquals("10\n", outContent.toString());
    }
}