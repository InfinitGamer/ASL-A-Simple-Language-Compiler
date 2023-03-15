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
		T__0=1, T__1=2, T__2=3, PAREOP=4, PARECL=5, CLAUOP=6, CLAUCL=7, LT=8, 
		LE=9, GT=10, GE=11, ASSIGN=12, EQUAL=13, NOTEQUAL=14, NOT=15, AND=16, 
		OR=17, PLUS=18, MINUS=19, MUL=20, DIV=21, MOD=22, VAR=23, INT=24, BOOL=25, 
		CHAR=26, FLOAT=27, IF=28, THEN=29, ELSE=30, ENDIF=31, WHILE=32, DO=33, 
		ENDWHILE=34, FUNC=35, RETURN=36, ENDFUNC=37, READ=38, WRITE=39, BOOLVAL=40, 
		INTVAL=41, CHARVAL=42, FLOATVAL=43, ID=44, STRING=45, COMMENT=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "PAREOP", "PARECL", "CLAUOP", "CLAUCL", "LT", 
			"LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", "NOT", "AND", "OR", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "INT", "BOOL", "CHAR", "FLOAT", 
			"IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", 
			"ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", 
			"ID", "STRING", "ESC_SEQ", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "';'", "'('", "')'", "'['", "']'", "'<'", "'<='", 
			"'>'", "'>='", "'='", "'=='", "'!='", "'not'", "'and'", "'or'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'var'", "'int'", "'bool'", "'char'", "'float'", 
			"'if'", "'then'", "'else'", "'endif'", "'while'", "'do'", "'endwhile'", 
			"'func'", "'return'", "'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PAREOP", "PARECL", "CLAUOP", "CLAUCL", "LT", 
			"LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", "NOT", "AND", "OR", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "INT", "BOOL", "CHAR", "FLOAT", 
			"IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", 
			"ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0146\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u00fe\n)\3*\6*\u0101"+
		"\n*\r*\16*\u0102\3+\3+\3+\3+\3+\3+\3+\3+\5+\u010d\n+\3+\3+\3,\6,\u0112"+
		"\n,\r,\16,\u0113\3,\3,\6,\u0118\n,\r,\16,\u0119\3-\3-\7-\u011e\n-\f-\16"+
		"-\u0121\13-\3.\3.\3.\7.\u0126\n.\f.\16.\u0129\13.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\7\60\u0134\n\60\f\60\16\60\u0137\13\60\3\60\5\60\u013a"+
		"\n\60\3\60\3\60\3\60\3\60\3\61\6\61\u0141\n\61\r\61\16\61\u0142\3\61\3"+
		"\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\60a\61\3\2\b\4\2C\\"+
		"c|\6\2\62;C\\aac|\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3"+
		"\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31"+
		"{\3\2\2\2\33}\3\2\2\2\35\u0080\3\2\2\2\37\u0083\3\2\2\2!\u0087\3\2\2\2"+
		"#\u008b\3\2\2\2%\u008e\3\2\2\2\'\u0090\3\2\2\2)\u0092\3\2\2\2+\u0094\3"+
		"\2\2\2-\u0096\3\2\2\2/\u0098\3\2\2\2\61\u009c\3\2\2\2\63\u00a0\3\2\2\2"+
		"\65\u00a5\3\2\2\2\67\u00aa\3\2\2\29\u00b0\3\2\2\2;\u00b3\3\2\2\2=\u00b8"+
		"\3\2\2\2?\u00bd\3\2\2\2A\u00c3\3\2\2\2C\u00c9\3\2\2\2E\u00cc\3\2\2\2G"+
		"\u00d5\3\2\2\2I\u00da\3\2\2\2K\u00e1\3\2\2\2M\u00e9\3\2\2\2O\u00ee\3\2"+
		"\2\2Q\u00fd\3\2\2\2S\u0100\3\2\2\2U\u0104\3\2\2\2W\u0111\3\2\2\2Y\u011b"+
		"\3\2\2\2[\u0122\3\2\2\2]\u012c\3\2\2\2_\u012f\3\2\2\2a\u0140\3\2\2\2c"+
		"d\7<\2\2d\4\3\2\2\2ef\7.\2\2f\6\3\2\2\2gh\7=\2\2h\b\3\2\2\2ij\7*\2\2j"+
		"\n\3\2\2\2kl\7+\2\2l\f\3\2\2\2mn\7]\2\2n\16\3\2\2\2op\7_\2\2p\20\3\2\2"+
		"\2qr\7>\2\2r\22\3\2\2\2st\7>\2\2tu\7?\2\2u\24\3\2\2\2vw\7@\2\2w\26\3\2"+
		"\2\2xy\7@\2\2yz\7?\2\2z\30\3\2\2\2{|\7?\2\2|\32\3\2\2\2}~\7?\2\2~\177"+
		"\7?\2\2\177\34\3\2\2\2\u0080\u0081\7#\2\2\u0081\u0082\7?\2\2\u0082\36"+
		"\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085\7q\2\2\u0085\u0086\7v\2\2\u0086"+
		" \3\2\2\2\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089\u008a\7f\2\2\u008a"+
		"\"\3\2\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d$\3\2\2\2\u008e"+
		"\u008f\7-\2\2\u008f&\3\2\2\2\u0090\u0091\7/\2\2\u0091(\3\2\2\2\u0092\u0093"+
		"\7,\2\2\u0093*\3\2\2\2\u0094\u0095\7\61\2\2\u0095,\3\2\2\2\u0096\u0097"+
		"\7\'\2\2\u0097.\3\2\2\2\u0098\u0099\7x\2\2\u0099\u009a\7c\2\2\u009a\u009b"+
		"\7t\2\2\u009b\60\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f"+
		"\7v\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\u00a4\7n\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7"+
		"\7j\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9\66\3\2\2\2\u00aa\u00ab"+
		"\7h\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7c\2\2\u00ae"+
		"\u00af\7v\2\2\u00af8\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2"+
		":\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc>\3\2\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7h\2\2"+
		"\u00c2@\3\2\2\2\u00c3\u00c4\7y\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7k\2"+
		"\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7"+
		"f\2\2\u00ca\u00cb\7q\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7p\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7y\2\2\u00d0\u00d1\7j\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4F\3\2\2\2\u00d5"+
		"\u00d6\7h\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7e\2\2"+
		"\u00d9H\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7v\2"+
		"\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7p\2\2\u00e0J\3\2"+
		"\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5"+
		"\7h\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7e\2\2\u00e8"+
		"L\3\2\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u00ed\7f\2\2\u00edN\3\2\2\2\u00ee\u00ef\7y\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3P\3\2\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7w\2\2\u00f7\u00fe\7g\2\2"+
		"\u00f8\u00f9\7h\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc"+
		"\7u\2\2\u00fc\u00fe\7g\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe"+
		"R\3\2\2\2\u00ff\u0101\4\62;\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103T\3\2\2\2\u0104\u010c\7"+
		")\2\2\u0105\u010d\13\2\2\2\u0106\u0107\7^\2\2\u0107\u010d\7p\2\2\u0108"+
		"\u0109\7^\2\2\u0109\u010d\7v\2\2\u010a\u010b\7^\2\2\u010b\u010d\7)\2\2"+
		"\u010c\u0105\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7)\2\2\u010fV\3\2\2\2\u0110\u0112"+
		"\4\62;\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7\60\2\2\u0116\u0118\4"+
		"\62;\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011aX\3\2\2\2\u011b\u011f\t\2\2\2\u011c\u011e\t\3\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120Z\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\7$\2\2\u0123\u0126"+
		"\5]/\2\u0124\u0126\n\4\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7$\2\2\u012b\\\3\2\2\2\u012c\u012d"+
		"\7^\2\2\u012d\u012e\t\5\2\2\u012e^\3\2\2\2\u012f\u0130\7\61\2\2\u0130"+
		"\u0131\7\61\2\2\u0131\u0135\3\2\2\2\u0132\u0134\n\6\2\2\u0133\u0132\3"+
		"\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\7\17\2\2\u0139\u0138\3"+
		"\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\f\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\b\60\2\2\u013e`\3\2\2\2\u013f\u0141\t\7\2\2"+
		"\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\61\2\2\u0145b\3\2\2\2\16\2"+
		"\u00fd\u0102\u010c\u0113\u0119\u011f\u0125\u0127\u0135\u0139\u0142\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}