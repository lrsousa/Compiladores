// Generated from src/Numbers.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumbersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, BINARY=2, DECIMAL=3, REAL=4, HEXADECIMAL=5, EXPONENCIAL=6, 
		SIMB_SOMA=7, SIMB_SUBT=8, SIMB_MULT=9, SIMB_DIVS=10, SIMB_EXPO=11, BIN_DIGIT=12, 
		DEC_DIGIT=13, HEX_DIGIT=14, COMANDO_STATUS=15, COMANDO_RESET=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "BINARY", "DECIMAL", "REAL", "HEXADECIMAL", "EXPONENCIAL", 
		"SIMB_SOMA", "SIMB_SUBT", "SIMB_MULT", "SIMB_DIVS", "SIMB_EXPO", "BIN_DIGIT", 
		"DEC_DIGIT", "HEX_DIGIT", "COMANDO_STATUS", "COMANDO_RESET"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
		"'^'", null, null, null, "'status'", "'reset'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "BINARY", "DECIMAL", "REAL", "HEXADECIMAL", "EXPONENCIAL", 
		"SIMB_SOMA", "SIMB_SUBT", "SIMB_MULT", "SIMB_DIVS", "SIMB_EXPO", "BIN_DIGIT", 
		"DEC_DIGIT", "HEX_DIGIT", "COMANDO_STATUS", "COMANDO_RESET"
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


	public NumbersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Numbers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2%\n"+
		"\2\r\2\16\2&\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\5\4\61\n\4\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\5\5\59\n\5\3\5\6\5<\n\5\r\5\16\5=\3\5\3\5\6\5B\n\5"+
		"\r\5\16\5C\3\6\3\6\3\6\6\6I\n\6\r\6\16\6J\3\7\3\7\5\7O\n\7\3\7\3\7\3\7"+
		"\6\7T\n\7\r\7\16\7U\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22\3\2\b\5\2\f\f\17\17\"\"\5\2GGgg~~\6\2)"+
		")--//~~\3\2\62\63\3\2\62;\6\2\62;CHch~~}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3$\3\2\2\2\5)\3\2\2\2\7\60\3\2\2\2\t"+
		"8\3\2\2\2\13E\3\2\2\2\rN\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25"+
		"]\3\2\2\2\27_\3\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2"+
		"!n\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\4\3\2"+
		"\2\2(*\5\31\r\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7"+
		"d\2\2.\6\3\2\2\2/\61\7/\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62"+
		"\64\5\33\16\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\66\b\3\2\2\2\679\7/\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\33\16\2;"+
		":\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\7\60\2\2@B\5\33\16"+
		"\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\n\3\2\2\2EF\7\62\2\2FH\7z"+
		"\2\2GI\5\35\17\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\f\3\2\2\2LO"+
		"\5\7\4\2MO\5\t\5\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\t\3\2\2QS\t\4\2\2R"+
		"T\5\33\16\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\16\3\2\2\2WX\7-\2"+
		"\2X\20\3\2\2\2YZ\7/\2\2Z\22\3\2\2\2[\\\7,\2\2\\\24\3\2\2\2]^\7\61\2\2"+
		"^\26\3\2\2\2_`\7`\2\2`\30\3\2\2\2ab\t\5\2\2b\32\3\2\2\2cd\t\6\2\2d\34"+
		"\3\2\2\2ef\t\7\2\2f\36\3\2\2\2gh\7u\2\2hi\7v\2\2ij\7c\2\2jk\7v\2\2kl\7"+
		"w\2\2lm\7u\2\2m \3\2\2\2no\7t\2\2op\7g\2\2pq\7u\2\2qr\7g\2\2rs\7v\2\2"+
		"s\"\3\2\2\2\r\2&+\60\658=CJNU\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}