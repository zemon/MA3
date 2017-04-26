// $ANTLR 3.5.1 C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g 2017-04-26 13:29:02

package transition_system.parsing;

import transition_system.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TransitionSystemParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "'*'", "','", 
		"'['", "']'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int ID=4;
	public static final int NUM=5;
	public static final int WS=6;

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
				if ( (LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:25:9: '}' s= state
					{
					match(input,12,FOLLOW_12_in_transitionSystem93); 
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:28:1: state returns [State value] : ( '{' NUM i= initial '[' p= prop ']' n= neighbours |);
	public final State state() throws RecognitionException {
		State value = null;


		Token NUM1=null;
		boolean i =false;
		ArrayList<String> p =null;
		ArrayList<Integer> n =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:29:5: ( '{' NUM i= initial '[' p= prop ']' n= neighbours |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==11) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF||LA2_0==12) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:29:7: '{' NUM i= initial '[' p= prop ']' n= neighbours
					{
					match(input,11,FOLLOW_11_in_state124); 
					NUM1=(Token)match(input,NUM,FOLLOW_NUM_in_state126); 
					pushFollow(FOLLOW_initial_in_state130);
					i=initial();
					state._fsp--;

					match(input,9,FOLLOW_9_in_state132); 
					pushFollow(FOLLOW_prop_in_state136);
					p=prop();
					state._fsp--;

					match(input,10,FOLLOW_10_in_state138); 
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:33:1: initial returns [boolean value] : ( '*' |);
	public final boolean initial() throws RecognitionException {
		boolean value = false;


		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:34:2: ( '*' |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==7) ) {
				alt3=1;
			}
			else if ( (LA3_0==9) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:34:4: '*'
					{
					match(input,7,FOLLOW_7_in_initial172); 
					value = true;
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:35:5: 
					{
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:38:1: prop returns [ ArrayList<String> value] : (|ap= atomic_propositions ( ',' ap= atomic_propositions )* );
	public final ArrayList<String> prop() throws RecognitionException {
		ArrayList<String> value = null;


		String ap =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:39:2: (|ap= atomic_propositions ( ',' ap= atomic_propositions )* )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==10) ) {
				alt5=1;
			}
			else if ( (LA5_0==ID) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:39:5: 
					{
					value = new ArrayList<String>(); value.add("");
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:40:4: ap= atomic_propositions ( ',' ap= atomic_propositions )*
					{
					pushFollow(FOLLOW_atomic_propositions_in_prop205);
					ap=atomic_propositions();
					state._fsp--;

					value = new ArrayList<String>();value.add(ap);
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:41:3: ( ',' ap= atomic_propositions )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==8) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:41:4: ',' ap= atomic_propositions
							{
							match(input,8,FOLLOW_8_in_prop211); 
							pushFollow(FOLLOW_atomic_propositions_in_prop217);
							ap=atomic_propositions();
							state._fsp--;

							value.add(ap);
							}
							break;

						default :
							break loop4;
						}
					}

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



	// $ANTLR start "atomic_propositions"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:43:1: atomic_propositions returns [String value] : ID ;
	public final String atomic_propositions() throws RecognitionException {
		String value = null;


		Token ID2=null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:44:3: ( ID )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:44:3: ID
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_atomic_propositions233); 
			value = ID2.getText();
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
	// $ANTLR end "atomic_propositions"



	// $ANTLR start "neighbours"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:47:1: neighbours returns [ArrayList<Integer> value] : n= transitions (n= transitions )* ;
	public final ArrayList<Integer> neighbours() throws RecognitionException {
		ArrayList<Integer> value = null;


		int n =0;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:49:2: (n= transitions (n= transitions )* )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:49:4: n= transitions (n= transitions )*
			{
			pushFollow(FOLLOW_transitions_in_neighbours254);
			n=transitions();
			state._fsp--;

			 value = new ArrayList<Integer>();value.add(n);
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:50:2: (n= transitions )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==NUM) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:50:5: n= transitions
					{
					pushFollow(FOLLOW_transitions_in_neighbours264);
					n=transitions();
					state._fsp--;

					 value.add(n); 
					}
					break;

				default :
					break loop6;
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
	// $ANTLR end "neighbours"



	// $ANTLR start "transitions"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:53:1: transitions returns [int value] : NUM ;
	public final int transitions() throws RecognitionException {
		int value = 0;


		Token NUM3=null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:54:3: ( NUM )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:54:3: NUM
			{
			NUM3=(Token)match(input,NUM,FOLLOW_NUM_in_transitions283); 
			value = Integer.parseInt(NUM3.getText());
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
	// $ANTLR end "transitions"

	// Delegated rules



	public static final BitSet FOLLOW_transitionSystem_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_state_in_transitionSystem76 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_transitionSystem93 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_state_in_transitionSystem97 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_11_in_state124 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUM_in_state126 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_initial_in_state130 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_state132 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_prop_in_state136 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_state138 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_neighbours_in_state142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_initial172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomic_propositions_in_prop205 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_prop211 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atomic_propositions_in_prop217 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ID_in_atomic_propositions233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transitions_in_neighbours254 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_transitions_in_neighbours264 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NUM_in_transitions283 = new BitSet(new long[]{0x0000000000000002L});
}
