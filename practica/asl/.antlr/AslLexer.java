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
		T__0=1, T__1=2, PAREOP=3, PARECL=4, LT=5, LE=6, GT=7, GE=8, ASSIGN=9, 
		EQUAL=10, NOTEQUAL=11, NOT=12, AND=13, OR=14, PLUS=15, MINUS=16, MUL=17, 
		DIV=18, VAR=19, INT=20, BOOL=21, CHAR=22, FLOAT=23, IF=24, THEN=25, ELSE=26, 
		ENDIF=27, FUNC=28, ENDFUNC=29, READ=30, WRITE=31, BOOLVAL=32, INTVAL=33, 
		CHARVAL=34, FLOATVAL=35, ID=36, STRING=37, COMMENT=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PAREOP", "PARECL", "LT", "LE", "GT", "GE", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", 
			"VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", 
			"FUNC", "ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", 
			"ID", "STRING", "ESC_SEQ", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'('", "')'", "'<'", "'<='", "'>'", "'>='", "'='", 
			"'=='", "'!='", "'not'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", 
			"'var'", "'int'", "'bool'", "'char'", "'float'", "'if'", "'then'", "'else'", 
			"'endif'", "'func'", "'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PAREOP", "PARECL", "LT", "LE", "GT", "GE", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", 
			"VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", 
			"FUNC", "ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", 
			"ID", "STRING", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00cd\n!\3\"\6\"\u00d0"+
		"\n\"\r\"\16\"\u00d1\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00dc\n#\3#\3#\3$\6$\u00e1"+
		"\n$\r$\16$\u00e2\3$\3$\6$\u00e7\n$\r$\16$\u00e8\3%\3%\7%\u00ed\n%\f%\16"+
		"%\u00f0\13%\3&\3&\3&\7&\u00f5\n&\f&\16&\u00f8\13&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\7(\u0103\n(\f(\16(\u0106\13(\3(\5(\u0109\n(\3(\3(\3(\3(\3)"+
		"\6)\u0110\n)\r)\16)\u0111\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O(Q)\3\2\b\4"+
		"\2C\\c|\6\2\62;C\\aac|\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S"+
		"\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17`\3"+
		"\2\2\2\21b\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31m\3\2\2\2\33"+
		"q\3\2\2\2\35u\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0080"+
		"\3\2\2\2)\u0084\3\2\2\2+\u0088\3\2\2\2-\u008d\3\2\2\2/\u0092\3\2\2\2\61"+
		"\u0098\3\2\2\2\63\u009b\3\2\2\2\65\u00a0\3\2\2\2\67\u00a5\3\2\2\29\u00ab"+
		"\3\2\2\2;\u00b0\3\2\2\2=\u00b8\3\2\2\2?\u00bd\3\2\2\2A\u00cc\3\2\2\2C"+
		"\u00cf\3\2\2\2E\u00d3\3\2\2\2G\u00e0\3\2\2\2I\u00ea\3\2\2\2K\u00f1\3\2"+
		"\2\2M\u00fb\3\2\2\2O\u00fe\3\2\2\2Q\u010f\3\2\2\2ST\7<\2\2T\4\3\2\2\2"+
		"UV\7=\2\2V\6\3\2\2\2WX\7*\2\2X\b\3\2\2\2YZ\7+\2\2Z\n\3\2\2\2[\\\7>\2\2"+
		"\\\f\3\2\2\2]^\7>\2\2^_\7?\2\2_\16\3\2\2\2`a\7@\2\2a\20\3\2\2\2bc\7@\2"+
		"\2cd\7?\2\2d\22\3\2\2\2ef\7?\2\2f\24\3\2\2\2gh\7?\2\2hi\7?\2\2i\26\3\2"+
		"\2\2jk\7#\2\2kl\7?\2\2l\30\3\2\2\2mn\7p\2\2no\7q\2\2op\7v\2\2p\32\3\2"+
		"\2\2qr\7c\2\2rs\7p\2\2st\7f\2\2t\34\3\2\2\2uv\7q\2\2vw\7t\2\2w\36\3\2"+
		"\2\2xy\7-\2\2y \3\2\2\2z{\7/\2\2{\"\3\2\2\2|}\7,\2\2}$\3\2\2\2~\177\7"+
		"\61\2\2\177&\3\2\2\2\u0080\u0081\7x\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7t\2\2\u0083(\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\7v\2\2\u0087*\3\2\2\2\u0088\u0089\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7n\2\2\u008c,\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f"+
		"\7j\2\2\u008f\u0090\7c\2\2\u0090\u0091\7t\2\2\u0091.\3\2\2\2\u0092\u0093"+
		"\7h\2\2\u0093\u0094\7n\2\2\u0094\u0095\7q\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7v\2\2\u0097\60\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a"+
		"\62\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7j\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7p\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2"+
		"\u00aa8\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7p\2"+
		"\2\u00ae\u00af\7e\2\2\u00af:\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7"+
		"p\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6"+
		"\7p\2\2\u00b6\u00b7\7e\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7f\2\2\u00bc>\3\2\2\2\u00bd\u00be"+
		"\7y\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7w\2\2\u00c6\u00cd\7g\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7c\2\2"+
		"\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cd\7g\2\2\u00cc\u00c3"+
		"\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cdB\3\2\2\2\u00ce\u00d0\4\62;\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2D\3\2\2\2\u00d3\u00db\7)\2\2\u00d4\u00dc\13\2\2\2\u00d5\u00d6"+
		"\7^\2\2\u00d6\u00dc\7p\2\2\u00d7\u00d8\7^\2\2\u00d8\u00dc\7v\2\2\u00d9"+
		"\u00da\7^\2\2\u00da\u00dc\7)\2\2\u00db\u00d4\3\2\2\2\u00db\u00d5\3\2\2"+
		"\2\u00db\u00d7\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\7)\2\2\u00deF\3\2\2\2\u00df\u00e1\4\62;\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\7\60\2\2\u00e5\u00e7\4\62;\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9H\3\2\2\2\u00ea\u00ee"+
		"\t\2\2\2\u00eb\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efJ\3\2\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f1\u00f6\7$\2\2\u00f2\u00f5\5M\'\2\u00f3\u00f5\n\4\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7$"+
		"\2\2\u00faL\3\2\2\2\u00fb\u00fc\7^\2\2\u00fc\u00fd\t\5\2\2\u00fdN\3\2"+
		"\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7\61\2\2\u0100\u0104\3\2\2\2\u0101"+
		"\u0103\n\6\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0109\7\17\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3"+
		"\2\2\2\u010a\u010b\7\f\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b(\2\2\u010d"+
		"P\3\2\2\2\u010e\u0110\t\7\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\b)\2\2\u0114R\3\2\2\2\16\2\u00cc\u00d1\u00db\u00e2\u00e8\u00ee\u00f4"+
		"\u00f6\u0104\u0108\u0111\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}