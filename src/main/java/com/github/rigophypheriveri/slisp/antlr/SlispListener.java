package com.github.rigophypheriveri.slisp.antlr;
// Generated from Slisp.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlispParser}.
 */
public interface SlispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlispParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SlispParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlispParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SlispParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADD(SlispParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADD(SlispParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBTRACT}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSUBTRACT(SlispParser.SUBTRACTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBTRACT}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSUBTRACT(SlispParser.SUBTRACTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTI}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMULTI(SlispParser.MULTIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTI}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMULTI(SlispParser.MULTIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDIVIDE(SlispParser.DIVIDEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDIVIDE(SlispParser.DIVIDEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRINT}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPRINT(SlispParser.PRINTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRINT}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPRINT(SlispParser.PRINTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterASSIGN(SlispParser.ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitASSIGN(SlispParser.ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIF(SlispParser.IFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIF(SlispParser.IFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPARE}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCOMPARE(SlispParser.COMPAREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPARE}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCOMPARE(SlispParser.COMPAREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(SlispParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(SlispParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(SlispParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(SlispParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(SlispParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(SlispParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SlispParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SlispParser.NumberContext ctx);
}