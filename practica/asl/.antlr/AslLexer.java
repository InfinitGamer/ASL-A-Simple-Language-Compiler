// Generated from /home/jeremy/Escritorio/ASL-A-Simple-Language-Compiler/practica/asl/Asl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PAREOP=3, PARECL=4, ASSIGN=5, EQUAL=6, PLUS=7, MINUS=8, 
		MUL=9, DIV=10, VAR=11, INT=12, BOOL=13, CHAR=14, FLOAT=15, IF=16, THEN=17, 
		ELSE=18, ENDIF=19, FUNC=20, ENDFUNC=21, READ=22, WRITE=23, BOOLVAL=24, 
		INTVAL=25, CHARVAL=26, FLOATVAL=27, ID=28, STRING=29, COMMENT=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PAREOP", "PARECL", "ASSIGN", "EQUAL", "PLUS", "MINUS", 
			"MUL", "DIV", "VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", 
			"ENDIF", "FUNC", "ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", 
			"FLOATVAL", "ID", "STRING", "ESC_SEQ", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'('", "')'", "'='", "'=='", "'+'", "'-'", "'*'", 
			"'/'", "'var'", "'int'", "'bool'", "'char'", "'float'", "'if'", "'then'", 
			"'else'", "'endif'", "'func'", "'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PAREOP", "PARECL", "ASSIGN", "EQUAL", "PLUS", "MINUS", 
			"MUL", "DIV", "VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", 
			"ENDIF", "FUNC", "ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", 
			"FLOATVAL", "ID", "STRING", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public AslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Asl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00a5\n\31\3\32\6\32"+
		"\u00a8\n\32\r\32\16\32\u00a9\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u00b4\n\33\3\33\3\33\3\34\6\34\u00b9\n\34\r\34\16\34\u00ba\3\34\3"+
		"\34\6\34\u00bf\n\34\r\34\16\34\u00c0\3\35\3\35\7\35\u00c5\n\35\f\35\16"+
		"\35\u00c8\13\35\3\36\3\36\3\36\7\36\u00cd\n\36\f\36\16\36\u00d0\13\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \7 \u00db\n \f \16 \u00de\13 \3 "+
		"\5 \u00e1\n \3 \3 \3 \3 \3!\6!\u00e8\n!\r!\16!\u00e9\3!\3!\2\2\"\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?"+
		" A!\3\2\b\4\2C\\c|\6\2\62;C\\aac|\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u00f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2"+
		"\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17P\3\2\2\2"+
		"\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31\\\3\2\2\2\33`\3\2"+
		"\2\2\35e\3\2\2\2\37j\3\2\2\2!p\3\2\2\2#s\3\2\2\2%x\3\2\2\2\'}\3\2\2\2"+
		")\u0083\3\2\2\2+\u0088\3\2\2\2-\u0090\3\2\2\2/\u0095\3\2\2\2\61\u00a4"+
		"\3\2\2\2\63\u00a7\3\2\2\2\65\u00ab\3\2\2\2\67\u00b8\3\2\2\29\u00c2\3\2"+
		"\2\2;\u00c9\3\2\2\2=\u00d3\3\2\2\2?\u00d6\3\2\2\2A\u00e7\3\2\2\2CD\7<"+
		"\2\2D\4\3\2\2\2EF\7=\2\2F\6\3\2\2\2GH\7*\2\2H\b\3\2\2\2IJ\7+\2\2J\n\3"+
		"\2\2\2KL\7?\2\2L\f\3\2\2\2MN\7?\2\2NO\7?\2\2O\16\3\2\2\2PQ\7-\2\2Q\20"+
		"\3\2\2\2RS\7/\2\2S\22\3\2\2\2TU\7,\2\2U\24\3\2\2\2VW\7\61\2\2W\26\3\2"+
		"\2\2XY\7x\2\2YZ\7c\2\2Z[\7t\2\2[\30\3\2\2\2\\]\7k\2\2]^\7p\2\2^_\7v\2"+
		"\2_\32\3\2\2\2`a\7d\2\2ab\7q\2\2bc\7q\2\2cd\7n\2\2d\34\3\2\2\2ef\7e\2"+
		"\2fg\7j\2\2gh\7c\2\2hi\7t\2\2i\36\3\2\2\2jk\7h\2\2kl\7n\2\2lm\7q\2\2m"+
		"n\7c\2\2no\7v\2\2o \3\2\2\2pq\7k\2\2qr\7h\2\2r\"\3\2\2\2st\7v\2\2tu\7"+
		"j\2\2uv\7g\2\2vw\7p\2\2w$\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2"+
		"|&\3\2\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7f\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7h\2\2\u0082(\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7w\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7e\2\2\u0087*\3\2\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b\u008c\7h\2\2\u008c\u008d\7w\2\2"+
		"\u008d\u008e\7p\2\2\u008e\u008f\7e\2\2\u008f,\3\2\2\2\u0090\u0091\7t\2"+
		"\2\u0091\u0092\7g\2\2\u0092\u0093\7c\2\2\u0093\u0094\7f\2\2\u0094.\3\2"+
		"\2\2\u0095\u0096\7y\2\2\u0096\u0097\7t\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7g\2\2\u009a\60\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7w\2\2\u009e\u00a5\7g\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a5\7g\2\2"+
		"\u00a4\u009b\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5\62\3\2\2\2\u00a6\u00a8"+
		"\4\62;\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\64\3\2\2\2\u00ab\u00b3\7)\2\2\u00ac\u00b4\13\2\2"+
		"\2\u00ad\u00ae\7^\2\2\u00ae\u00b4\7p\2\2\u00af\u00b0\7^\2\2\u00b0\u00b4"+
		"\7v\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b4\7)\2\2\u00b3\u00ac\3\2\2\2\u00b3"+
		"\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\7)\2\2\u00b6\66\3\2\2\2\u00b7\u00b9\4\62;\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\7\60\2\2\u00bd\u00bf\4\62;\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"8\3\2\2\2\u00c2\u00c6\t\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7:\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\7$\2\2\u00ca\u00cd\5=\37\2\u00cb"+
		"\u00cd\n\4\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7^\2\2\u00d4"+
		"\u00d5\t\5\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\7\61\2"+
		"\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\n\6\2\2\u00da\u00d9\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e1\7\17\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b \2\2\u00e5@\3\2\2\2\u00e6\u00e8\t\7\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\b!\2\2\u00ecB\3\2\2\2\16\2\u00a4\u00a9\u00b3\u00ba\u00c0"+
		"\u00c6\u00cc\u00ce\u00dc\u00e0\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}