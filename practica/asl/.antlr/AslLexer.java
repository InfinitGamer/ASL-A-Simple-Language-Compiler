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
		T__0=1, T__1=2, T__2=3, PAREOP=4, PARECL=5, LT=6, LE=7, GT=8, GE=9, ASSIGN=10, 
		EQUAL=11, NOTEQUAL=12, NOT=13, AND=14, OR=15, PLUS=16, MINUS=17, MUL=18, 
		DIV=19, MOD=20, VAR=21, INT=22, BOOL=23, CHAR=24, FLOAT=25, IF=26, THEN=27, 
		ELSE=28, ENDIF=29, WHILE=30, DO=31, ENDWHILE=32, FUNC=33, RETURN=34, ENDFUNC=35, 
		READ=36, WRITE=37, BOOLVAL=38, INTVAL=39, CHARVAL=40, FLOATVAL=41, ID=42, 
		STRING=43, COMMENT=44, WS=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "PAREOP", "PARECL", "LT", "LE", "GT", "GE", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", 
			"WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", "READ", "WRITE", 
			"BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", "ID", "STRING", "ESC_SEQ", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "';'", "'('", "')'", "'<'", "'<='", "'>'", "'>='", 
			"'='", "'=='", "'!='", "'not'", "'and'", "'or'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'var'", "'int'", "'bool'", "'char'", "'float'", "'if'", 
			"'then'", "'else'", "'endif'", "'while'", "'do'", "'endwhile'", "'func'", 
			"'return'", "'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PAREOP", "PARECL", "LT", "LE", "GT", "GE", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", 
			"WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", "READ", "WRITE", 
			"BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", "ID", "STRING", "COMMENT", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00f6\n\'\3(\6(\u00f9\n(\r(\16(\u00fa\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u0105\n)\3)\3)\3*\6*\u010a\n*\r*\16*\u010b\3"+
		"*\3*\6*\u0110\n*\r*\16*\u0111\3+\3+\7+\u0116\n+\f+\16+\u0119\13+\3,\3"+
		",\3,\7,\u011e\n,\f,\16,\u0121\13,\3,\3,\3-\3-\3-\3.\3.\3.\3.\7.\u012c"+
		"\n.\f.\16.\u012f\13.\3.\5.\u0132\n.\3.\3.\3.\3.\3/\6/\u0139\n/\r/\16/"+
		"\u013a\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]/\3\2\b\4\2C\\"+
		"c|\6\2\62;C\\aac|\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2\u0149\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5"+
		"a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21"+
		"n\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2"+
		"\35\177\3\2\2\2\37\u0083\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a"+
		"\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0090\3\2\2\2-\u0094\3\2\2\2"+
		"/\u0098\3\2\2\2\61\u009d\3\2\2\2\63\u00a2\3\2\2\2\65\u00a8\3\2\2\2\67"+
		"\u00ab\3\2\2\29\u00b0\3\2\2\2;\u00b5\3\2\2\2=\u00bb\3\2\2\2?\u00c1\3\2"+
		"\2\2A\u00c4\3\2\2\2C\u00cd\3\2\2\2E\u00d2\3\2\2\2G\u00d9\3\2\2\2I\u00e1"+
		"\3\2\2\2K\u00e6\3\2\2\2M\u00f5\3\2\2\2O\u00f8\3\2\2\2Q\u00fc\3\2\2\2S"+
		"\u0109\3\2\2\2U\u0113\3\2\2\2W\u011a\3\2\2\2Y\u0124\3\2\2\2[\u0127\3\2"+
		"\2\2]\u0138\3\2\2\2_`\7<\2\2`\4\3\2\2\2ab\7.\2\2b\6\3\2\2\2cd\7=\2\2d"+
		"\b\3\2\2\2ef\7*\2\2f\n\3\2\2\2gh\7+\2\2h\f\3\2\2\2ij\7>\2\2j\16\3\2\2"+
		"\2kl\7>\2\2lm\7?\2\2m\20\3\2\2\2no\7@\2\2o\22\3\2\2\2pq\7@\2\2qr\7?\2"+
		"\2r\24\3\2\2\2st\7?\2\2t\26\3\2\2\2uv\7?\2\2vw\7?\2\2w\30\3\2\2\2xy\7"+
		"#\2\2yz\7?\2\2z\32\3\2\2\2{|\7p\2\2|}\7q\2\2}~\7v\2\2~\34\3\2\2\2\177"+
		"\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082\7f\2\2\u0082\36\3\2\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085 \3\2\2\2\u0086\u0087\7-\2\2\u0087"+
		"\"\3\2\2\2\u0088\u0089\7/\2\2\u0089$\3\2\2\2\u008a\u008b\7,\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\7\61\2\2\u008d(\3\2\2\2\u008e\u008f\7\'\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7x\2\2\u0091\u0092\7c\2\2\u0092\u0093\7t\2\2\u0093"+
		",\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097"+
		".\3\2\2\2\u0098\u0099\7d\2\2\u0099\u009a\7q\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7n\2\2\u009c\60\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7j\2\2\u009f"+
		"\u00a0\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\64\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa\66\3\2\2"+
		"\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7p\2\2\u00af8\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3"+
		"\7u\2\2\u00b3\u00b4\7g\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"<\3\2\2\2\u00bb\u00bc\7y\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3@\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\u00c7\7f\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7h\2"+
		"\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7e\2\2\u00d1D\3\2"+
		"\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7w\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7p\2\2\u00d8F\3\2\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7h\2\2\u00dd"+
		"\u00de\7w\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7e\2\2\u00e0H\3\2\2\2\u00e1"+
		"\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7f\2\2"+
		"\u00e5J\3\2\2\2\u00e6\u00e7\7y\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7k\2"+
		"\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7g\2\2\u00ebL\3\2\2\2\u00ec\u00ed\7"+
		"v\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f6\7g\2\2\u00f0\u00f1"+
		"\7h\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4"+
		"\u00f6\7g\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6N\3\2\2\2\u00f7"+
		"\u00f9\4\62;\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fbP\3\2\2\2\u00fc\u0104\7)\2\2\u00fd\u0105"+
		"\13\2\2\2\u00fe\u00ff\7^\2\2\u00ff\u0105\7p\2\2\u0100\u0101\7^\2\2\u0101"+
		"\u0105\7v\2\2\u0102\u0103\7^\2\2\u0103\u0105\7)\2\2\u0104\u00fd\3\2\2"+
		"\2\u0104\u00fe\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\7)\2\2\u0107R\3\2\2\2\u0108\u010a\4\62;\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\7\60\2\2\u010e\u0110\4\62;\2\u010f\u010e\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"T\3\2\2\2\u0113\u0117\t\2\2\2\u0114\u0116\t\3\2\2\u0115\u0114\3\2\2\2"+
		"\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118V\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u011a\u011f\7$\2\2\u011b\u011e\5Y-\2\u011c"+
		"\u011e\n\4\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7$\2\2\u0123X\3\2\2\2\u0124\u0125\7^\2\2\u0125"+
		"\u0126\t\5\2\2\u0126Z\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129\7\61\2"+
		"\2\u0129\u012d\3\2\2\2\u012a\u012c\n\6\2\2\u012b\u012a\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0132\7\17\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\f\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\b.\2\2\u0136\\\3\2\2\2\u0137\u0139\t\7\2\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\b/\2\2\u013d^\3\2\2\2\16\2\u00f5\u00fa\u0104\u010b"+
		"\u0111\u0117\u011d\u011f\u012d\u0131\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}