// $ANTLR 3.5.1 C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g 2017-04-25 18:20:52

package transition_system.parsing;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TransitionSystemLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int ID=4;
	public static final int NUM=5;

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

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:12:6: ( ' ' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:12:8: ' '
			{
			match(' '); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:13:6: ( ' ] ' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:13:8: ' ] '
			{
			match(" ] "); 

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
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:14:6: ( '* ' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:14:8: '* '
			{
			match("* "); 

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
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:15:6: ( '[ ' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:15:8: '[ '
			{
			match("[ "); 

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
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:16:7: ( '{ ' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:16:9: '{ '
			{
			match("{ "); 

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
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:17:7: ( '}' )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:17:9: '}'
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
	// $ANTLR end "T__11"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:54:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:54:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:54:7: ( '0' .. '9' )+
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
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:55:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:55:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:55:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | NUM | ID )
		int alt3=8;
		switch ( input.LA(1) ) {
		case ' ':
			{
			int LA3_1 = input.LA(2);
			if ( (LA3_1==']') ) {
				alt3=2;
			}

			else {
				alt3=1;
			}

			}
			break;
		case '*':
			{
			alt3=3;
			}
			break;
		case '[':
			{
			alt3=4;
			}
			break;
		case '{':
			{
			alt3=5;
			}
			break;
		case '}':
			{
			alt3=6;
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
			alt3=7;
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
		case 'c':
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
			alt3=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:36: T__11
				{
				mT__11(); 

				}
				break;
			case 7 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:42: NUM
				{
				mNUM(); 

				}
				break;
			case 8 :
				// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:1:46: ID
				{
				mID(); 

				}
				break;

		}
	}



}
