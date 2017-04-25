// $ANTLR 3.5.1 C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g 2017-04-25 18:20:52

package transition_system.parsing;

import transition_system.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TransitionSystemParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "' '", "' ] '", "'* '", 
		"'[ '", "'{ '", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TransitionSystemParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TransitionSystemParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TransitionSystemParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:19:1: program returns [TS value] : s= transitionSystem EOF ;
	public final TS program() throws RecognitionException {
		TS value = null;


		ArrayList<State> s =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:20:5: (s= transitionSystem EOF )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:20:7: s= transitionSystem EOF
			{
			pushFollow(FOLLOW_transitionSystem_in_program49);
			s=transitionSystem();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program51); 
			 value = new TS(s); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "program"



	// $ANTLR start "transitionSystem"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:23:1: transitionSystem returns [ArrayList<State> value] : s= state ( '}' s= state )* ;
	public final ArrayList<State> transitionSystem() throws RecognitionException {
		ArrayList<State> value = null;


		State s =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:24:5: (s= state ( '}' s= state )* )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:24:7: s= state ( '}' s= state )*
			{
			pushFollow(FOLLOW_state_in_transitionSystem76);
			s=state();
			state._fsp--;

			value = new ArrayList<State>(); value.add(s); 
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:25:7: ( '}' s= state )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==11) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:25:9: '}' s= state
					{
					match(input,11,FOLLOW_11_in_transitionSystem93); 
					pushFollow(FOLLOW_state_in_transitionSystem97);
					s=state();
					state._fsp--;

					 value.add(s); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "transitionSystem"



	// $ANTLR start "state"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:28:1: state returns [State value] : ( '{ ' NUM i= initial '[ ' p= prop ' ] ' n= neighbours |);
	public final State state() throws RecognitionException {
		State value = null;


		Token NUM1=null;
		boolean i =false;
		String p =null;
		String n =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:29:5: ( '{ ' NUM i= initial '[ ' p= prop ' ] ' n= neighbours |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==10) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF||LA2_0==11) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:29:7: '{ ' NUM i= initial '[ ' p= prop ' ] ' n= neighbours
					{
					match(input,10,FOLLOW_10_in_state124); 
					NUM1=(Token)match(input,NUM,FOLLOW_NUM_in_state126); 
					pushFollow(FOLLOW_initial_in_state130);
					i=initial();
					state._fsp--;

					match(input,9,FOLLOW_9_in_state132); 
					pushFollow(FOLLOW_prop_in_state136);
					p=prop();
					state._fsp--;

					match(input,7,FOLLOW_7_in_state138); 
					pushFollow(FOLLOW_neighbours_in_state142);
					n=neighbours();
					state._fsp--;

					value = new State(Integer.parseInt(NUM1.getText()), i, p, n );
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:30:8: 
					{
					value = null;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "state"



	// $ANTLR start "initial"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:33:1: initial returns [boolean value] : ( '* ' | ' ' );
	public final boolean initial() throws RecognitionException {
		boolean value = false;


		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:34:2: ( '* ' | ' ' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==8) ) {
				alt3=1;
			}
			else if ( (LA3_0==6) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:34:4: '* '
					{
					match(input,8,FOLLOW_8_in_initial172); 
					value = true;
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:35:4: ' '
					{
					match(input,6,FOLLOW_6_in_initial179); 
					value = false;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "initial"



	// $ANTLR start "prop"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:38:1: prop returns [ String value] : ( ' ' | ID );
	public final String prop() throws RecognitionException {
		String value = null;


		Token ID2=null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:39:2: ( ' ' | ID )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==6) ) {
				alt4=1;
			}
			else if ( (LA4_0==ID) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:39:4: ' '
					{
					match(input,6,FOLLOW_6_in_prop196); 
					value = " ";
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:40:4: ID
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_prop203); 
					value = ID2.getText();
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "prop"



	// $ANTLR start "neighbours"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:43:1: neighbours returns [String value] : ( ' ' |n= ( ( NUM ' ' )* ) );
	public final String neighbours() throws RecognitionException {
		String value = null;


		Token n=null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:44:2: ( ' ' |n= ( ( NUM ' ' )* ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==6) ) {
				alt6=1;
			}
			else if ( (LA6_0==EOF||LA6_0==NUM||LA6_0==11) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:44:4: ' '
					{
					match(input,6,FOLLOW_6_in_neighbours220); 
					value =" ";
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:45:3: n= ( ( NUM ' ' )* )
					{
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:45:5: ( ( NUM ' ' )* )
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:45:6: ( NUM ' ' )*
					{
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:45:6: ( NUM ' ' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==NUM) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:45:7: NUM ' '
							{
							n=(Token)match(input,NUM,FOLLOW_NUM_in_neighbours232); 
							n=(Token)match(input,6,FOLLOW_6_in_neighbours234); 
							}
							break;

						default :
							break loop5;
						}
					}

					}

					value = n.getText();
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "neighbours"

	// Delegated rules



	public static final BitSet FOLLOW_transitionSystem_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_state_in_transitionSystem76 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_transitionSystem93 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_state_in_transitionSystem97 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_10_in_state124 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUM_in_state126 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_initial_in_state130 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_state132 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_prop_in_state136 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_state138 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_neighbours_in_state142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_initial172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_initial179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_prop196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_prop203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_neighbours220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_neighbours232 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_neighbours234 = new BitSet(new long[]{0x0000000000000022L});
}
