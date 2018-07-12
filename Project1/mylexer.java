// $ANTLR 3.5.2 mylexer.g 2018-04-03 10:42:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int BIGGER_OP=4;
	public static final int BL_PARENTHESES=5;
	public static final int BREAK=6;
	public static final int BR_PARENTHESES=7;
	public static final int CHAR=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT1=11;
	public static final int COMMENT2=12;
	public static final int COMMENT3=13;
	public static final int CONTINUE=14;
	public static final int DEFINE=15;
	public static final int DE_OP=16;
	public static final int DIGIT=17;
	public static final int DIV_OP=18;
	public static final int DOUBLE=19;
	public static final int ELIF=20;
	public static final int ELSE=21;
	public static final int EQ_OP=22;
	public static final int FLOAT=23;
	public static final int FLOAT_NUM=24;
	public static final int FLOAT_NUM1=25;
	public static final int FLOAT_NUM2=26;
	public static final int FLOAT_NUM3=27;
	public static final int FOR=28;
	public static final int GE_OP=29;
	public static final int GIVEN_OP=30;
	public static final int ID=31;
	public static final int IF=32;
	public static final int INCLUDE=33;
	public static final int INT=34;
	public static final int INT_NUM=35;
	public static final int LETTER=36;
	public static final int LE_OP=37;
	public static final int LIB_FILE=38;
	public static final int LONG=39;
	public static final int LSHIFT_OP=40;
	public static final int ME_OP=41;
	public static final int MUL_OP=42;
	public static final int NEW_LINE=43;
	public static final int NE_OP=44;
	public static final int OWN_FILE=45;
	public static final int PE_OP=46;
	public static final int PLUSONE_OP=47;
	public static final int PLUS_OP=48;
	public static final int POINTER=49;
	public static final int QUESTION=50;
	public static final int RETURN=51;
	public static final int RSHIFT_OP=52;
	public static final int SEMICOLON=53;
	public static final int SE_OP=54;
	public static final int SHORT=55;
	public static final int SL_BRACKET=56;
	public static final int SMALLER_OP=57;
	public static final int SR_BRACKET=58;
	public static final int SUBONE_OP=59;
	public static final int SUB_OP=60;
	public static final int TYPE=61;
	public static final int VOID=62;
	public static final int WHILE=63;
	public static final int WS=64;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:16: ( 'int' )
			// mylexer.g:12:18: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:16: ( 'char' )
			// mylexer.g:13:18: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:14:16: ( 'void' )
			// mylexer.g:14:18: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:16: ( 'float' )
			// mylexer.g:15:18: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:16: ( 'long' )
			// mylexer.g:16:18: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:16: ( 'short' )
			// mylexer.g:17:18: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:16: ( 'double' )
			// mylexer.g:18:18: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:16: ( 'while' )
			// mylexer.g:19:18: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:16: ( 'for' )
			// mylexer.g:20:18: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:16: ( 'if' )
			// mylexer.g:21:18: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELIF"
	public final void mELIF() throws RecognitionException {
		try {
			int _type = ELIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:16: ( 'else if' )
			// mylexer.g:22:18: 'else if'
			{
			match("else if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELIF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:16: ( 'else' )
			// mylexer.g:23:18: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:16: ( 'break' )
			// mylexer.g:24:18: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:16: ( 'continue' )
			// mylexer.g:25:18: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:16: ( 'return' )
			// mylexer.g:26:18: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:16: ( '#include' ( ' ' | '\\t' )+ )
			// mylexer.g:27:18: '#include' ( ' ' | '\\t' )+
			{
			match("#include"); 

			// mylexer.g:27:29: ( ' ' | '\\t' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\t'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "OWN_FILE"
	public final void mOWN_FILE() throws RecognitionException {
		try {
			int _type = OWN_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:28:16: ( '\"' ( ID )+ '.h\"' )
			// mylexer.g:28:18: '\"' ( ID )+ '.h\"'
			{
			match('\"'); 
			// mylexer.g:28:22: ( ID )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// mylexer.g:28:22: ID
					{
					mID(); 

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(".h\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OWN_FILE"

	// $ANTLR start "LIB_FILE"
	public final void mLIB_FILE() throws RecognitionException {
		try {
			int _type = LIB_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:16: ( '<' ( ID )+ '.h>' )
			// mylexer.g:29:18: '<' ( ID )+ '.h>'
			{
			match('<'); 
			// mylexer.g:29:22: ( ID )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mylexer.g:29:22: ID
					{
					mID(); 

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(".h>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIB_FILE"

	// $ANTLR start "DEFINE"
	public final void mDEFINE() throws RecognitionException {
		try {
			int _type = DEFINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:16: ( '#define' )
			// mylexer.g:30:18: '#define'
			{
			match("#define"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE"

	// $ANTLR start "SL_BRACKET"
	public final void mSL_BRACKET() throws RecognitionException {
		try {
			int _type = SL_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:31:16: ( '(' )
			// mylexer.g:31:18: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_BRACKET"

	// $ANTLR start "SR_BRACKET"
	public final void mSR_BRACKET() throws RecognitionException {
		try {
			int _type = SR_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:32:16: ( ')' )
			// mylexer.g:32:18: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SR_BRACKET"

	// $ANTLR start "BL_PARENTHESES"
	public final void mBL_PARENTHESES() throws RecognitionException {
		try {
			int _type = BL_PARENTHESES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:33:16: ( '{' )
			// mylexer.g:33:18: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BL_PARENTHESES"

	// $ANTLR start "BR_PARENTHESES"
	public final void mBR_PARENTHESES() throws RecognitionException {
		try {
			int _type = BR_PARENTHESES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:34:16: ( '}' )
			// mylexer.g:34:18: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BR_PARENTHESES"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:16: ( ';' )
			// mylexer.g:35:18: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:16: ( ',' )
			// mylexer.g:36:18: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:16: ( ':' )
			// mylexer.g:37:18: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:16: ( '?' )
			// mylexer.g:38:18: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "POINTER"
	public final void mPOINTER() throws RecognitionException {
		try {
			int _type = POINTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:16: ( '*' ( ( ID )+ | '*' ) )
			// mylexer.g:39:18: '*' ( ( ID )+ | '*' )
			{
			match('*'); 
			// mylexer.g:39:22: ( ( ID )+ | '*' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
				alt5=1;
			}
			else if ( (LA5_0=='*') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// mylexer.g:39:23: ( ID )+
					{
					// mylexer.g:39:23: ( ID )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// mylexer.g:39:23: ID
							{
							mID(); 

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;
				case 2 :
					// mylexer.g:39:29: '*'
					{
					match('*'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINTER"

	// $ANTLR start "GIVEN_OP"
	public final void mGIVEN_OP() throws RecognitionException {
		try {
			int _type = GIVEN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:12: ( '=' )
			// mylexer.g:45:14: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GIVEN_OP"

	// $ANTLR start "BIGGER_OP"
	public final void mBIGGER_OP() throws RecognitionException {
		try {
			int _type = BIGGER_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:12: ( '>' )
			// mylexer.g:46:14: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIGGER_OP"

	// $ANTLR start "SMALLER_OP"
	public final void mSMALLER_OP() throws RecognitionException {
		try {
			int _type = SMALLER_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:12: ( '<' )
			// mylexer.g:47:14: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALLER_OP"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:12: ( '==' )
			// mylexer.g:48:14: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "PE_OP"
	public final void mPE_OP() throws RecognitionException {
		try {
			int _type = PE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:49:12: ( '+=' )
			// mylexer.g:49:14: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PE_OP"

	// $ANTLR start "SE_OP"
	public final void mSE_OP() throws RecognitionException {
		try {
			int _type = SE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:12: ( '-=' )
			// mylexer.g:50:14: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SE_OP"

	// $ANTLR start "ME_OP"
	public final void mME_OP() throws RecognitionException {
		try {
			int _type = ME_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:12: ( '*=' )
			// mylexer.g:51:14: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ME_OP"

	// $ANTLR start "DE_OP"
	public final void mDE_OP() throws RecognitionException {
		try {
			int _type = DE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:12: ( '/=' )
			// mylexer.g:52:14: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DE_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:12: ( '<=' )
			// mylexer.g:53:14: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:12: ( '>=' )
			// mylexer.g:54:14: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:12: ( '!=' )
			// mylexer.g:55:14: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PLUS_OP"
	public final void mPLUS_OP() throws RecognitionException {
		try {
			int _type = PLUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:12: ( '+' )
			// mylexer.g:56:14: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_OP"

	// $ANTLR start "SUB_OP"
	public final void mSUB_OP() throws RecognitionException {
		try {
			int _type = SUB_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:12: ( '-' )
			// mylexer.g:57:14: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB_OP"

	// $ANTLR start "DIV_OP"
	public final void mDIV_OP() throws RecognitionException {
		try {
			int _type = DIV_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:12: ( '/' )
			// mylexer.g:58:14: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:12: ( '*' )
			// mylexer.g:59:14: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "PLUSONE_OP"
	public final void mPLUSONE_OP() throws RecognitionException {
		try {
			int _type = PLUSONE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:12: ( '++' )
			// mylexer.g:60:14: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUSONE_OP"

	// $ANTLR start "SUBONE_OP"
	public final void mSUBONE_OP() throws RecognitionException {
		try {
			int _type = SUBONE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:12: ( '--' )
			// mylexer.g:61:14: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBONE_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:12: ( '<<' )
			// mylexer.g:62:14: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:12: ( '>>' )
			// mylexer.g:63:14: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "INT_NUM"
	public final void mINT_NUM() throws RecognitionException {
		try {
			int _type = INT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:69:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:69:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:69:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// mylexer.g:69:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:69:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:69:28: ( DIGIT )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:70:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:70:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:70:14: ( LETTER | DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:10: ( ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 ) )
			// mylexer.g:71:12: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			{
			// mylexer.g:71:12: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// mylexer.g:71:13: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:71:26: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:71:39: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:73:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:73:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:73:22: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match('.'); 
			// mylexer.g:73:33: ( DIGIT )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:74:20: ( '.' ( DIGIT )+ )
			// mylexer.g:74:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:74:25: ( DIGIT )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:75:20: ( ( DIGIT )+ )
			// mylexer.g:75:22: ( DIGIT )+
			{
			// mylexer.g:75:22: ( DIGIT )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:81:10: ( '\"' (~ ( '\"' ) )* '\"' )
			// mylexer.g:81:12: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// mylexer.g:81:16: (~ ( '\"' ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:82:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:82:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:82:17: ( options {greedy=false; } : . )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='*') ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1=='/') ) {
						alt15=2;
					}
					else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
						alt15=1;
					}

				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// mylexer.g:82:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop15;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "COMMENT3"
	public final void mCOMMENT3() throws RecognitionException {
		try {
			int _type = COMMENT3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:83:10: ( '//' ( . )* '\\n' )
			// mylexer.g:83:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:83:17: ( . )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\n') ) {
					alt16=2;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// mylexer.g:83:18: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop16;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT3"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:84:10: ( ( ( '\\r' )? '\\n' ) )
			// mylexer.g:84:12: ( ( '\\r' )? '\\n' )
			{
			// mylexer.g:84:12: ( ( '\\r' )? '\\n' )
			// mylexer.g:84:13: ( '\\r' )? '\\n'
			{
			// mylexer.g:84:13: ( '\\r' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\r') ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// mylexer.g:84:13: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:86:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:87:17: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			// mylexer.g:88:17: ( ( 'char' | 'int' | 'short' | 'double' | 'long' | 'float' | 'void' ) )
			// mylexer.g:88:19: ( 'char' | 'int' | 'short' | 'double' | 'long' | 'float' | 'void' )
			{
			// mylexer.g:88:19: ( 'char' | 'int' | 'short' | 'double' | 'long' | 'float' | 'void' )
			int alt18=7;
			switch ( input.LA(1) ) {
			case 'c':
				{
				alt18=1;
				}
				break;
			case 'i':
				{
				alt18=2;
				}
				break;
			case 's':
				{
				alt18=3;
				}
				break;
			case 'd':
				{
				alt18=4;
				}
				break;
			case 'l':
				{
				alt18=5;
				}
				break;
			case 'f':
				{
				alt18=6;
				}
				break;
			case 'v':
				{
				alt18=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// mylexer.g:88:20: 'char'
					{
					match("char"); 

					}
					break;
				case 2 :
					// mylexer.g:88:29: 'int'
					{
					match("int"); 

					}
					break;
				case 3 :
					// mylexer.g:88:37: 'short'
					{
					match("short"); 

					}
					break;
				case 4 :
					// mylexer.g:88:47: 'double'
					{
					match("double"); 

					}
					break;
				case 5 :
					// mylexer.g:88:58: 'long'
					{
					match("long"); 

					}
					break;
				case 6 :
					// mylexer.g:88:67: 'float'
					{
					match("float"); 

					}
					break;
				case 7 :
					// mylexer.g:88:77: 'void'
					{
					match("void"); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:90:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:90:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:90:7: ( ' ' | '\\r' | '\\t' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='\t'||LA19_0=='\r'||LA19_0==' ') ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( INT | CHAR | VOID | FLOAT | LONG | SHORT | DOUBLE | WHILE | FOR | IF | ELIF | ELSE | BREAK | CONTINUE | RETURN | INCLUDE | OWN_FILE | LIB_FILE | DEFINE | SL_BRACKET | SR_BRACKET | BL_PARENTHESES | BR_PARENTHESES | SEMICOLON | COMMA | COLON | QUESTION | POINTER | GIVEN_OP | BIGGER_OP | SMALLER_OP | EQ_OP | PE_OP | SE_OP | ME_OP | DE_OP | LE_OP | GE_OP | NE_OP | PLUS_OP | SUB_OP | DIV_OP | MUL_OP | PLUSONE_OP | SUBONE_OP | RSHIFT_OP | LSHIFT_OP | INT_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | COMMENT3 | NEW_LINE | WS )
		int alt20=55;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// mylexer.g:1:10: INT
				{
				mINT(); 

				}
				break;
			case 2 :
				// mylexer.g:1:14: CHAR
				{
				mCHAR(); 

				}
				break;
			case 3 :
				// mylexer.g:1:19: VOID
				{
				mVOID(); 

				}
				break;
			case 4 :
				// mylexer.g:1:24: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 5 :
				// mylexer.g:1:30: LONG
				{
				mLONG(); 

				}
				break;
			case 6 :
				// mylexer.g:1:35: SHORT
				{
				mSHORT(); 

				}
				break;
			case 7 :
				// mylexer.g:1:41: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:48: WHILE
				{
				mWHILE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:54: FOR
				{
				mFOR(); 

				}
				break;
			case 10 :
				// mylexer.g:1:58: IF
				{
				mIF(); 

				}
				break;
			case 11 :
				// mylexer.g:1:61: ELIF
				{
				mELIF(); 

				}
				break;
			case 12 :
				// mylexer.g:1:66: ELSE
				{
				mELSE(); 

				}
				break;
			case 13 :
				// mylexer.g:1:71: BREAK
				{
				mBREAK(); 

				}
				break;
			case 14 :
				// mylexer.g:1:77: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 15 :
				// mylexer.g:1:86: RETURN
				{
				mRETURN(); 

				}
				break;
			case 16 :
				// mylexer.g:1:93: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 17 :
				// mylexer.g:1:101: OWN_FILE
				{
				mOWN_FILE(); 

				}
				break;
			case 18 :
				// mylexer.g:1:110: LIB_FILE
				{
				mLIB_FILE(); 

				}
				break;
			case 19 :
				// mylexer.g:1:119: DEFINE
				{
				mDEFINE(); 

				}
				break;
			case 20 :
				// mylexer.g:1:126: SL_BRACKET
				{
				mSL_BRACKET(); 

				}
				break;
			case 21 :
				// mylexer.g:1:137: SR_BRACKET
				{
				mSR_BRACKET(); 

				}
				break;
			case 22 :
				// mylexer.g:1:148: BL_PARENTHESES
				{
				mBL_PARENTHESES(); 

				}
				break;
			case 23 :
				// mylexer.g:1:163: BR_PARENTHESES
				{
				mBR_PARENTHESES(); 

				}
				break;
			case 24 :
				// mylexer.g:1:178: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 25 :
				// mylexer.g:1:188: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 26 :
				// mylexer.g:1:194: COLON
				{
				mCOLON(); 

				}
				break;
			case 27 :
				// mylexer.g:1:200: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 28 :
				// mylexer.g:1:209: POINTER
				{
				mPOINTER(); 

				}
				break;
			case 29 :
				// mylexer.g:1:217: GIVEN_OP
				{
				mGIVEN_OP(); 

				}
				break;
			case 30 :
				// mylexer.g:1:226: BIGGER_OP
				{
				mBIGGER_OP(); 

				}
				break;
			case 31 :
				// mylexer.g:1:236: SMALLER_OP
				{
				mSMALLER_OP(); 

				}
				break;
			case 32 :
				// mylexer.g:1:247: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 33 :
				// mylexer.g:1:253: PE_OP
				{
				mPE_OP(); 

				}
				break;
			case 34 :
				// mylexer.g:1:259: SE_OP
				{
				mSE_OP(); 

				}
				break;
			case 35 :
				// mylexer.g:1:265: ME_OP
				{
				mME_OP(); 

				}
				break;
			case 36 :
				// mylexer.g:1:271: DE_OP
				{
				mDE_OP(); 

				}
				break;
			case 37 :
				// mylexer.g:1:277: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 38 :
				// mylexer.g:1:283: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 39 :
				// mylexer.g:1:289: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 40 :
				// mylexer.g:1:295: PLUS_OP
				{
				mPLUS_OP(); 

				}
				break;
			case 41 :
				// mylexer.g:1:303: SUB_OP
				{
				mSUB_OP(); 

				}
				break;
			case 42 :
				// mylexer.g:1:310: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 43 :
				// mylexer.g:1:317: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 44 :
				// mylexer.g:1:324: PLUSONE_OP
				{
				mPLUSONE_OP(); 

				}
				break;
			case 45 :
				// mylexer.g:1:335: SUBONE_OP
				{
				mSUBONE_OP(); 

				}
				break;
			case 46 :
				// mylexer.g:1:345: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 47 :
				// mylexer.g:1:355: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 48 :
				// mylexer.g:1:365: INT_NUM
				{
				mINT_NUM(); 

				}
				break;
			case 49 :
				// mylexer.g:1:373: ID
				{
				mID(); 

				}
				break;
			case 50 :
				// mylexer.g:1:376: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 51 :
				// mylexer.g:1:386: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 52 :
				// mylexer.g:1:395: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 53 :
				// mylexer.g:1:404: COMMENT3
				{
				mCOMMENT3(); 

				}
				break;
			case 54 :
				// mylexer.g:1:413: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 55 :
				// mylexer.g:1:422: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA9_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\2\71\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "71:12: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )";
		}
	}

	static final String DFA20_eotS =
		"\1\uffff\13\40\2\uffff\1\72\10\uffff\1\75\1\77\1\102\1\105\1\110\1\114"+
		"\1\uffff\2\115\2\uffff\1\44\2\uffff\1\40\1\120\14\40\33\uffff\1\115\1"+
		"\140\1\uffff\4\40\1\145\7\40\4\uffff\1\156\1\40\1\160\1\40\1\uffff\1\162"+
		"\3\40\1\167\2\40\2\uffff\1\40\1\uffff\1\174\1\uffff\1\175\1\40\1\177\2"+
		"\uffff\1\u0080\1\40\1\uffff\1\40\2\uffff\1\u0084\2\uffff\1\u0085\1\uffff"+
		"\1\40\2\uffff\1\u0087\1\uffff";
	static final String DFA20_eofS =
		"\u0088\uffff";
	static final String DFA20_minS =
		"\1\11\1\146\1\150\1\157\1\154\1\157\1\150\1\157\1\150\1\154\1\162\1\145"+
		"\1\144\1\0\1\74\10\uffff\1\52\2\75\1\53\1\55\1\52\1\uffff\2\56\2\uffff"+
		"\1\12\2\uffff\1\164\1\60\1\141\1\156\1\151\1\157\1\162\1\156\1\157\1\165"+
		"\1\151\1\163\1\145\1\164\2\uffff\1\0\30\uffff\1\56\1\60\1\uffff\1\162"+
		"\1\164\1\144\1\141\1\60\1\147\1\162\1\142\1\154\1\145\1\141\1\165\3\0"+
		"\1\uffff\1\60\1\151\1\60\1\164\1\uffff\1\60\1\164\1\154\1\145\1\40\1\153"+
		"\1\162\1\0\1\uffff\1\156\1\uffff\1\60\1\uffff\1\60\1\145\1\60\2\uffff"+
		"\1\60\1\156\1\uffff\1\165\2\uffff\1\60\2\uffff\1\60\1\uffff\1\145\2\uffff"+
		"\1\60\1\uffff";
	static final String DFA20_maxS =
		"\1\175\1\156\4\157\1\150\1\157\1\150\1\154\1\162\1\145\1\151\1\uffff\1"+
		"\172\10\uffff\1\172\1\75\1\76\3\75\1\uffff\2\71\2\uffff\1\12\2\uffff\1"+
		"\164\1\172\1\141\1\156\1\151\1\157\1\162\1\156\1\157\1\165\1\151\1\163"+
		"\1\145\1\164\2\uffff\1\uffff\30\uffff\1\71\1\172\1\uffff\1\162\1\164\1"+
		"\144\1\141\1\172\1\147\1\162\1\142\1\154\1\145\1\141\1\165\3\uffff\1\uffff"+
		"\1\172\1\151\1\172\1\164\1\uffff\1\172\1\164\1\154\1\145\1\172\1\153\1"+
		"\162\1\uffff\1\uffff\1\156\1\uffff\1\172\1\uffff\1\172\1\145\1\172\2\uffff"+
		"\1\172\1\156\1\uffff\1\165\2\uffff\1\172\2\uffff\1\172\1\uffff\1\145\2"+
		"\uffff\1\172\1\uffff";
	static final String DFA20_acceptS =
		"\17\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\6\uffff\1\47\2\uffff"+
		"\1\61\1\62\1\uffff\1\66\1\67\16\uffff\1\20\1\23\1\uffff\1\63\1\45\1\56"+
		"\1\22\1\37\1\43\1\34\1\53\1\40\1\35\1\46\1\57\1\36\1\41\1\54\1\50\1\42"+
		"\1\55\1\51\1\44\1\64\1\65\1\52\1\60\2\uffff\1\12\17\uffff\1\1\4\uffff"+
		"\1\11\10\uffff\1\2\1\uffff\1\3\1\uffff\1\5\3\uffff\1\13\1\14\2\uffff\1"+
		"\21\1\uffff\1\4\1\6\1\uffff\1\10\1\15\1\uffff\1\21\1\uffff\1\7\1\17\1"+
		"\uffff\1\16";
	static final String DFA20_specialS =
		"\15\uffff\1\1\47\uffff\1\3\47\uffff\1\0\1\4\1\2\15\uffff\1\5\32\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\44\1\43\2\uffff\1\42\22\uffff\1\44\1\35\1\15\1\14\4\uffff\1\17\1\20"+
			"\1\27\1\32\1\24\1\33\1\41\1\34\1\36\11\37\1\25\1\23\1\16\1\30\1\31\1"+
			"\26\1\uffff\32\40\4\uffff\1\40\1\uffff\1\40\1\12\1\2\1\7\1\11\1\4\2\40"+
			"\1\1\2\40\1\5\5\40\1\13\1\6\2\40\1\3\1\10\3\40\1\21\1\uffff\1\22",
			"\1\46\7\uffff\1\45",
			"\1\47\6\uffff\1\50",
			"\1\51",
			"\1\52\2\uffff\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\64\4\uffff\1\63",
			"\101\66\32\65\4\66\1\65\1\66\32\65\uff85\66",
			"\1\70\1\67\3\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\74\22\uffff\1\73\3\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76",
			"\1\100\1\101",
			"\1\104\21\uffff\1\103",
			"\1\107\17\uffff\1\106",
			"\1\112\4\uffff\1\113\15\uffff\1\111",
			"",
			"\1\41\1\uffff\12\41",
			"\1\41\1\uffff\12\116",
			"",
			"",
			"\1\43",
			"",
			"",
			"\1\117",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"",
			"\56\66\1\136\1\66\12\137\7\66\32\135\4\66\1\135\1\66\32\135\uff85\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41\1\uffff\12\116",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\56\66\1\136\1\66\12\137\7\66\32\135\4\66\1\135\1\66\32\135\uff85\66",
			"\150\66\1\155\uff97\66",
			"\56\66\1\136\1\66\12\137\7\66\32\135\4\66\1\135\1\66\32\135\uff85\66",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\157",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\161",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166\17\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\170",
			"\1\171",
			"\42\66\1\172\uffdd\66",
			"",
			"\1\173",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\176",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0081",
			"",
			"\1\u0083",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0086",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT | CHAR | VOID | FLOAT | LONG | SHORT | DOUBLE | WHILE | FOR | IF | ELIF | ELSE | BREAK | CONTINUE | RETURN | INCLUDE | OWN_FILE | LIB_FILE | DEFINE | SL_BRACKET | SR_BRACKET | BL_PARENTHESES | BR_PARENTHESES | SEMICOLON | COMMA | COLON | QUESTION | POINTER | GIVEN_OP | BIGGER_OP | SMALLER_OP | EQ_OP | PE_OP | SE_OP | ME_OP | DE_OP | LE_OP | GE_OP | NE_OP | PLUS_OP | SUB_OP | DIV_OP | MUL_OP | PLUSONE_OP | SUBONE_OP | RSHIFT_OP | LSHIFT_OP | INT_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | COMMENT3 | NEW_LINE | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA20_93 = input.LA(1);
						s = -1;
						if ( (LA20_93=='.') ) {s = 94;}
						else if ( ((LA20_93 >= 'A' && LA20_93 <= 'Z')||LA20_93=='_'||(LA20_93 >= 'a' && LA20_93 <= 'z')) ) {s = 93;}
						else if ( ((LA20_93 >= '0' && LA20_93 <= '9')) ) {s = 95;}
						else if ( ((LA20_93 >= '\u0000' && LA20_93 <= '-')||LA20_93=='/'||(LA20_93 >= ':' && LA20_93 <= '@')||(LA20_93 >= '[' && LA20_93 <= '^')||LA20_93=='`'||(LA20_93 >= '{' && LA20_93 <= '\uFFFF')) ) {s = 54;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA20_13 = input.LA(1);
						s = -1;
						if ( ((LA20_13 >= 'A' && LA20_13 <= 'Z')||LA20_13=='_'||(LA20_13 >= 'a' && LA20_13 <= 'z')) ) {s = 53;}
						else if ( ((LA20_13 >= '\u0000' && LA20_13 <= '@')||(LA20_13 >= '[' && LA20_13 <= '^')||LA20_13=='`'||(LA20_13 >= '{' && LA20_13 <= '\uFFFF')) ) {s = 54;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA20_95 = input.LA(1);
						s = -1;
						if ( (LA20_95=='.') ) {s = 94;}
						else if ( ((LA20_95 >= 'A' && LA20_95 <= 'Z')||LA20_95=='_'||(LA20_95 >= 'a' && LA20_95 <= 'z')) ) {s = 93;}
						else if ( ((LA20_95 >= '0' && LA20_95 <= '9')) ) {s = 95;}
						else if ( ((LA20_95 >= '\u0000' && LA20_95 <= '-')||LA20_95=='/'||(LA20_95 >= ':' && LA20_95 <= '@')||(LA20_95 >= '[' && LA20_95 <= '^')||LA20_95=='`'||(LA20_95 >= '{' && LA20_95 <= '\uFFFF')) ) {s = 54;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA20_53 = input.LA(1);
						s = -1;
						if ( ((LA20_53 >= 'A' && LA20_53 <= 'Z')||LA20_53=='_'||(LA20_53 >= 'a' && LA20_53 <= 'z')) ) {s = 93;}
						else if ( (LA20_53=='.') ) {s = 94;}
						else if ( ((LA20_53 >= '0' && LA20_53 <= '9')) ) {s = 95;}
						else if ( ((LA20_53 >= '\u0000' && LA20_53 <= '-')||LA20_53=='/'||(LA20_53 >= ':' && LA20_53 <= '@')||(LA20_53 >= '[' && LA20_53 <= '^')||LA20_53=='`'||(LA20_53 >= '{' && LA20_53 <= '\uFFFF')) ) {s = 54;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA20_94 = input.LA(1);
						s = -1;
						if ( (LA20_94=='h') ) {s = 109;}
						else if ( ((LA20_94 >= '\u0000' && LA20_94 <= 'g')||(LA20_94 >= 'i' && LA20_94 <= '\uFFFF')) ) {s = 54;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA20_109 = input.LA(1);
						s = -1;
						if ( (LA20_109=='\"') ) {s = 122;}
						else if ( ((LA20_109 >= '\u0000' && LA20_109 <= '!')||(LA20_109 >= '#' && LA20_109 <= '\uFFFF')) ) {s = 54;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 20, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
