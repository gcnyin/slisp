package com.github.rigophypheriveri.slisp.antlr;
// Generated from Slisp.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BOOL=16, ID=17, 
		NUMBER=18, WS=19, STRING_LITERAL=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "BOOL", "ID", "NUMBER", 
		"WS", "STRING_LITERAL", "EscapeSequence", "HexDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'+'", "')'", "'-'", "'*'", "'/'", "'println'", "'define'", 
		"'if'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BOOL", "ID", "NUMBER", "WS", "STRING_LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SlispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Slisp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21g\n\21\3\22\6\22j\n\22\r\22\16\22k\3\23\6\23o\n"+
		"\23\r\23\16\23p\3\24\6\24t\n\24\r\24\16\24u\3\24\3\24\3\25\3\25\3\25\7"+
		"\25}\n\25\f\25\16\25\u0080\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0088"+
		"\n\26\3\26\5\26\u008b\n\26\3\26\3\26\3\26\6\26\u0090\n\26\r\26\16\26\u0091"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0099\n\26\3\27\3\27\2\2\30\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\2-\2\3\2\n\4\2C\\c|\3\2\62;\4\2\13\f\"\"\6\2\f\f\17\17"+
		"$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62;CHch\2\u00a4\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65"+
		"\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21C\3\2\2\2\23J\3\2\2\2"+
		"\25M\3\2\2\2\27P\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37Z\3\2\2"+
		"\2!f\3\2\2\2#i\3\2\2\2%n\3\2\2\2\'s\3\2\2\2)y\3\2\2\2+\u0098\3\2\2\2-"+
		"\u009a\3\2\2\2/\60\7*\2\2\60\4\3\2\2\2\61\62\7-\2\2\62\6\3\2\2\2\63\64"+
		"\7+\2\2\64\b\3\2\2\2\65\66\7/\2\2\66\n\3\2\2\2\678\7,\2\28\f\3\2\2\29"+
		":\7\61\2\2:\16\3\2\2\2;<\7r\2\2<=\7t\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@A"+
		"\7n\2\2AB\7p\2\2B\20\3\2\2\2CD\7f\2\2DE\7g\2\2EF\7h\2\2FG\7k\2\2GH\7p"+
		"\2\2HI\7g\2\2I\22\3\2\2\2JK\7k\2\2KL\7h\2\2L\24\3\2\2\2MN\7?\2\2NO\7?"+
		"\2\2O\26\3\2\2\2PQ\7#\2\2QR\7?\2\2R\30\3\2\2\2ST\7@\2\2T\32\3\2\2\2UV"+
		"\7>\2\2V\34\3\2\2\2WX\7@\2\2XY\7?\2\2Y\36\3\2\2\2Z[\7>\2\2[\\\7?\2\2\\"+
		" \3\2\2\2]^\7v\2\2^_\7t\2\2_`\7w\2\2`g\7g\2\2ab\7h\2\2bc\7c\2\2cd\7n\2"+
		"\2de\7u\2\2eg\7g\2\2f]\3\2\2\2fa\3\2\2\2g\"\3\2\2\2hj\t\2\2\2ih\3\2\2"+
		"\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l$\3\2\2\2mo\t\3\2\2nm\3\2\2\2op\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2q&\3\2\2\2rt\t\4\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vw\3\2\2\2wx\b\24\2\2x(\3\2\2\2y~\7$\2\2z}\n\5\2\2{}\5+\26"+
		"\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7$\2\2\u0082*\3\2\2\2\u0083\u0084"+
		"\7^\2\2\u0084\u0099\t\6\2\2\u0085\u008a\7^\2\2\u0086\u0088\t\7\2\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\t\b"+
		"\2\2\u008a\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0099\t\b\2\2\u008d\u008f\7^\2\2\u008e\u0090\7w\2\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\5-\27\2\u0094\u0095\5-\27\2\u0095\u0096\5-\27\2\u0096"+
		"\u0097\5-\27\2\u0097\u0099\3\2\2\2\u0098\u0083\3\2\2\2\u0098\u0085\3\2"+
		"\2\2\u0098\u008d\3\2\2\2\u0099,\3\2\2\2\u009a\u009b\t\t\2\2\u009b.\3\2"+
		"\2\2\r\2fkpu|~\u0087\u008a\u0091\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}