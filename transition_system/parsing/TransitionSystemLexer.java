// $ANTLR 3.5.1 C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g 2017-04-26 14:52:56

package transition_system.parsing;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TransitionSystemLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int ID=4;
	public static final int NUM=5;
	public static final int WS=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TransitionSystemLexer() {} 
	public TransitionSystemLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TransitionSystemLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:12:6: ( ')' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:12:8: ')'
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
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:13:6: ( '*' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:13:8: '*'
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:14:6: ( ',' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:14:8: ','
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:15:7: ( '[' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:15:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:16:7: ( ']' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:16:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:17:7: ( 'ctlAG(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:17:9: 'ctlAG('
			{
			match("ctlAG("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:18:7: ( 'ctlAP(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:18:9: 'ctlAP('
			{
			match("ctlAP("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:19:7: ( 'ctlAX(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:19:9: 'ctlAX('
			{
			match("ctlAX("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:20:7: ( 'ctlAnd(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:20:9: 'ctlAnd('
			{
			match("ctlAnd("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:21:7: ( 'ctlEF(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:21:9: 'ctlEF('
			{
			match("ctlEF("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:22:7: ( 'ctlEX(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:22:9: 'ctlEX('
			{
			match("ctlEX("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:23:7: ( 'ctlNot(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:23:9: 'ctlNot('
			{
			match("ctlNot("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:24:7: ( 'ctlTT(' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:24:9: 'ctlTT('
			{
			match("ctlTT("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:25:7: ( '{' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:25:9: '{'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:26:7: ( '}' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:26:9: '}'
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
	// $ANTLR end "T__21"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:77:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:77:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:77:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:
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
	// $ANTLR end "NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:78:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:78:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:78:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:79:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:79:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:79:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 _channel = HIDDEN; 
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
		// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | NUM | ID | WS )
		int alt4=18;
		switch ( input.LA(1) ) {
		case ')':
			{
			alt4=1;
			}
			break;
		case '*':
			{
			alt4=2;
			}
			break;
		case ',':
			{
			alt4=3;
			}
			break;
		case '[':
			{
			alt4=4;
			}
			break;
		case ']':
			{
			alt4=5;
			}
			break;
		case 'c':
			{
			int LA4_6 = input.LA(2);
			if ( (LA4_6=='t') ) {
				int LA4_12 = input.LA(3);
				if ( (LA4_12=='l') ) {
					switch ( input.LA(4) ) {
					case 'A':
						{
						switch ( input.LA(5) ) {
						case 'G':
							{
							int LA4_18 = input.LA(6);
							if ( (LA4_18=='(') ) {
								alt4=6;
							}

							else {
								alt4=17;
							}

							}
							break;
						case 'P':
							{
							int LA4_19 = input.LA(6);
							if ( (LA4_19=='(') ) {
								alt4=7;
							}

							else {
								alt4=17;
							}

							}
							break;
						case 'X':
							{
							int LA4_20 = input.LA(6);
							if ( (LA4_20=='(') ) {
								alt4=8;
							}

							else {
								alt4=17;
							}

							}
							break;
						case 'n':
							{
							int LA4_21 = input.LA(6);
							if ( (LA4_21=='d') ) {
								int LA4_29 = input.LA(7);
								if ( (LA4_29=='(') ) {
									alt4=9;
								}

								else {
									alt4=17;
								}

							}

							else {
								alt4=17;
							}

							}
							break;
						default:
							alt4=17;
						}
						}
						break;
					case 'E':
						{
						switch ( input.LA(5) ) {
						case 'F':
							{
							int LA4_22 = input.LA(6);
							if ( (LA4_22=='(') ) {
								alt4=10;
							}

							else {
								alt4=17;
							}

							}
							break;
						case 'X':
							{
							int LA4_23 = input.LA(6);
							if ( (LA4_23=='(') ) {
								alt4=11;
							}

							else {
								alt4=17;
							}

							}
							break;
						default:
							alt4=17;
						}
						}
						break;
					case 'N':
						{
						int LA4_16 = input.LA(5);
						if ( (LA4_16=='o') ) {
							int LA4_24 = input.LA(6);
							if ( (LA4_24=='t') ) {
								int LA4_32 = input.LA(7);
								if ( (LA4_32=='(') ) {
									alt4=12;
								}

								else {
									alt4=17;
								}

							}

							else {
								alt4=17;
							}

						}

						else {
							alt4=17;
						}

						}
						break;
					case 'T':
						{
						int LA4_17 = input.LA(5);
						if ( (LA4_17=='T') ) {
							int LA4_25 = input.LA(6);
							if ( (LA4_25=='(') ) {
								alt4=13;
							}

							else {
								alt4=17;
							}

						}

						else {
							alt4=17;
						}

						}
						break;
					default:
						alt4=17;
					}
				}

				else {
					alt4=17;
				}

			}

			else {
				alt4=17;
			}

			}
			break;
		case '{':
			{
			alt4=14;
			}
			break;
		case '}':
			{
			alt4=15;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=16;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=17;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=18;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:43: T__13
				{
				mT__13(); 

				}
				break;
			case 8 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:49: T__14
				{
				mT__14(); 

				}
				break;
			case 9 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:55: T__15
				{
				mT__15(); 

				}
				break;
			case 10 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:61: T__16
				{
				mT__16(); 

				}
				break;
			case 11 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:67: T__17
				{
				mT__17(); 

				}
				break;
			case 12 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:73: T__18
				{
				mT__18(); 

				}
				break;
			case 13 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:79: T__19
				{
				mT__19(); 

				}
				break;
			case 14 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:85: T__20
				{
				mT__20(); 

				}
				break;
			case 15 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:91: T__21
				{
				mT__21(); 

				}
				break;
			case 16 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:97: NUM
				{
				mNUM(); 

				}
				break;
			case 17 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:101: ID
				{
				mID(); 

				}
				break;
			case 18 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:104: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
