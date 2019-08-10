package com.github.rigophypheriveri.slisp.antlr;
// Generated from Slisp.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SlispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SlispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SlispParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SlispParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(SlispParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUBTRACT}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUBTRACT(SlispParser.SUBTRACTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTI}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTI(SlispParser.MULTIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVIDE(SlispParser.DIVIDEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRINT}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRINT(SlispParser.PRINTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGN(SlispParser.ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF(SlispParser.IFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPARE}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPARE(SlispParser.COMPAREContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SlispParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(SlispParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SlispParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link SlispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SlispParser.NumberContext ctx);
}