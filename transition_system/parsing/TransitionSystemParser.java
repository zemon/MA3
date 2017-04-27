// $ANTLR 3.5.1 C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g 2017-04-27 15:18:09

package transition_system.parsing;

import transition_system.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TransitionSystemParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM_PROP", "NUM", "WS", "')'", 
		"'*'", "','", "'['", "']'", "'ctlAG('", "'ctlAP('", "'ctlAX('", "'ctlAnd('", 
		"'ctlEF('", "'ctlEX('", "'ctlNot('", "'ctlTT('", "'{'", "'}'"
	};
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
	public static final int ATOM_PROP=4;
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:21:1: program returns [TS value] : s= ctlFormulaes EOF ;
	public final TS program() throws RecognitionException {
		TS value = null;


		TS s =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:22:5: (s= ctlFormulaes EOF )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:22:7: s= ctlFormulaes EOF
			{
			pushFollow(FOLLOW_ctlFormulaes_in_program51);
			s=ctlFormulaes();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program53); 
			 value = (s); 
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



	// $ANTLR start "ctlFormulaes"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:25:1: ctlFormulaes returns [TS value] : (s= transitionSystem | 'ctlTT(' ctl= ctlFormulaes ')' | 'ctlAP(' ctl= ctlFormulaes ',' ATOM_PROP ')' | 'ctlEX(' ctl= ctlFormulaes ')' | 'ctlEF(' ctl= ctlFormulaes ')' | 'ctlAX(' ctl= ctlFormulaes ')' | 'ctlAG(' ctl= ctlFormulaes ')' | 'ctlAnd(' ctl1= ctlFormulaes ',' ctl2= ctlFormulaes ')' | 'ctlNot(' ctl= ctlFormulaes ')' );
	public final TS ctlFormulaes() throws RecognitionException {
		TS value = null;


		Token ATOM_PROP1=null;
		ArrayList<State> s =null;
		TS ctl =null;
		TS ctl1 =null;
		TS ctl2 =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:26:3: (s= transitionSystem | 'ctlTT(' ctl= ctlFormulaes ')' | 'ctlAP(' ctl= ctlFormulaes ',' ATOM_PROP ')' | 'ctlEX(' ctl= ctlFormulaes ')' | 'ctlEF(' ctl= ctlFormulaes ')' | 'ctlAX(' ctl= ctlFormulaes ')' | 'ctlAG(' ctl= ctlFormulaes ')' | 'ctlAnd(' ctl1= ctlFormulaes ',' ctl2= ctlFormulaes ')' | 'ctlNot(' ctl= ctlFormulaes ')' )
			int alt1=9;
			switch ( input.LA(1) ) {
			case EOF:
			case 7:
			case 9:
			case 20:
			case 21:
				{
				alt1=1;
				}
				break;
			case 19:
				{
				alt1=2;
				}
				break;
			case 13:
				{
				alt1=3;
				}
				break;
			case 17:
				{
				alt1=4;
				}
				break;
			case 16:
				{
				alt1=5;
				}
				break;
			case 14:
				{
				alt1=6;
				}
				break;
			case 12:
				{
				alt1=7;
				}
				break;
			case 15:
				{
				alt1=8;
				}
				break;
			case 18:
				{
				alt1=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:26:3: s= transitionSystem
					{
					pushFollow(FOLLOW_transitionSystem_in_ctlFormulaes76);
					s=transitionSystem();
					state._fsp--;

					value = new TS(s);
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:27:3: 'ctlTT(' ctl= ctlFormulaes ')'
					{
					match(input,19,FOLLOW_19_in_ctlFormulaes82); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes88);
					ctl=ctlFormulaes();
					state._fsp--;

					match(input,7,FOLLOW_7_in_ctlFormulaes90); 
					value = ctl ;
					}
					break;
				case 3 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:28:3: 'ctlAP(' ctl= ctlFormulaes ',' ATOM_PROP ')'
					{
					match(input,13,FOLLOW_13_in_ctlFormulaes96); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes102);
					ctl=ctlFormulaes();
					state._fsp--;

					match(input,9,FOLLOW_9_in_ctlFormulaes104); 
					ATOM_PROP1=(Token)match(input,ATOM_PROP,FOLLOW_ATOM_PROP_in_ctlFormulaes106); 
					match(input,7,FOLLOW_7_in_ctlFormulaes108); 
					value = ctl;value.ctlAP(ATOM_PROP1.getText());
					}
					break;
				case 4 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:29:3: 'ctlEX(' ctl= ctlFormulaes ')'
					{
					match(input,17,FOLLOW_17_in_ctlFormulaes114); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes120);
					ctl=ctlFormulaes();
					state._fsp--;

					match(input,7,FOLLOW_7_in_ctlFormulaes122); 
					value = ctl;value.ctlEX(value.results);
					}
					break;
				case 5 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:30:3: 'ctlEF(' ctl= ctlFormulaes ')'
					{
					match(input,16,FOLLOW_16_in_ctlFormulaes128); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes134);
					ctl=ctlFormulaes();
					state._fsp--;

					match(input,7,FOLLOW_7_in_ctlFormulaes136); 
					value = ctl;value.ctlEF(value.results);
					}
					break;
				case 6 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:31:3: 'ctlAX(' ctl= ctlFormulaes ')'
					{
					match(input,14,FOLLOW_14_in_ctlFormulaes142); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes148);
					ctl=ctlFormulaes();
					state._fsp--;

					match(input,7,FOLLOW_7_in_ctlFormulaes150); 
					value = ctl;value.ctlAX(value.results);
					}
					break;
				case 7 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:32:3: 'ctlAG(' ctl= ctlFormulaes ')'
					{
					match(input,12,FOLLOW_12_in_ctlFormulaes156); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes162);
					ctl=ctlFormulaes();
					state._fsp--;

					match(input,7,FOLLOW_7_in_ctlFormulaes164); 
					value = ctl;value.ctlAG(value.results);
					}
					break;
				case 8 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:33:3: 'ctlAnd(' ctl1= ctlFormulaes ',' ctl2= ctlFormulaes ')'
					{
					match(input,15,FOLLOW_15_in_ctlFormulaes170); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes176);
					ctl1=ctlFormulaes();
					state._fsp--;

					match(input,9,FOLLOW_9_in_ctlFormulaes178); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes184);
					ctl2=ctlFormulaes();
					state._fsp--;

					match(input,7,FOLLOW_7_in_ctlFormulaes187); 
					value = ctl;value.ctlEX(value.results);
					}
					break;
				case 9 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:34:3: 'ctlNot(' ctl= ctlFormulaes ')'
					{
					match(input,18,FOLLOW_18_in_ctlFormulaes193); 
					pushFollow(FOLLOW_ctlFormulaes_in_ctlFormulaes199);
					ctl=ctlFormulaes();
					state._fsp--;

					match(input,7,FOLLOW_7_in_ctlFormulaes201); 
					value = ctl;value.ctlNot(value.results);
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
	// $ANTLR end "ctlFormulaes"



	// $ANTLR start "transitionSystem"
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:37:1: transitionSystem returns [ArrayList<State> value] : s= state ( '}' s= state )* ;
	public final ArrayList<State> transitionSystem() throws RecognitionException {
		ArrayList<State> value = null;


		State s =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:38:5: (s= state ( '}' s= state )* )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:38:7: s= state ( '}' s= state )*
			{
			pushFollow(FOLLOW_state_in_transitionSystem223);
			s=state();
			state._fsp--;

			value = new ArrayList<State>(); value.add(s); 
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:39:7: ( '}' s= state )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==21) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:39:9: '}' s= state
					{
					match(input,21,FOLLOW_21_in_transitionSystem240); 
					pushFollow(FOLLOW_state_in_transitionSystem244);
					s=state();
					state._fsp--;

					 value.add(s); 
					}
					break;

				default :
					break loop2;
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:42:1: state returns [State value] : ( '{' NUM i= initial '[' p= prop ']' n= neighbours |);
	public final State state() throws RecognitionException {
		State value = null;


		Token NUM2=null;
		boolean i =false;
		ArrayList<String> p =null;
		ArrayList<Integer> n =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:43:5: ( '{' NUM i= initial '[' p= prop ']' n= neighbours |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==20) ) {
				alt3=1;
			}
			else if ( (LA3_0==EOF||LA3_0==7||LA3_0==9||LA3_0==21) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:43:7: '{' NUM i= initial '[' p= prop ']' n= neighbours
					{
					match(input,20,FOLLOW_20_in_state271); 
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_state273); 
					pushFollow(FOLLOW_initial_in_state277);
					i=initial();
					state._fsp--;

					match(input,10,FOLLOW_10_in_state279); 
					pushFollow(FOLLOW_prop_in_state283);
					p=prop();
					state._fsp--;

					match(input,11,FOLLOW_11_in_state285); 
					pushFollow(FOLLOW_neighbours_in_state289);
					n=neighbours();
					state._fsp--;

					value = new State(Integer.parseInt(NUM2.getText()), i, p, n );
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:44:8: 
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:47:1: initial returns [boolean value] : ( '*' |);
	public final boolean initial() throws RecognitionException {
		boolean value = false;


		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:48:2: ( '*' |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==8) ) {
				alt4=1;
			}
			else if ( (LA4_0==10) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:48:4: '*'
					{
					match(input,8,FOLLOW_8_in_initial319); 
					value = true;
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:49:5: 
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:52:1: prop returns [ ArrayList<String> value] : (|ap= atomic_propositions ( ',' ap= atomic_propositions )* );
	public final ArrayList<String> prop() throws RecognitionException {
		ArrayList<String> value = null;


		String ap =null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:53:2: (|ap= atomic_propositions ( ',' ap= atomic_propositions )* )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==11) ) {
				alt6=1;
			}
			else if ( (LA6_0==ATOM_PROP) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:53:5: 
					{
					value = new ArrayList<String>(); value.add("");
					}
					break;
				case 2 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:54:4: ap= atomic_propositions ( ',' ap= atomic_propositions )*
					{
					pushFollow(FOLLOW_atomic_propositions_in_prop352);
					ap=atomic_propositions();
					state._fsp--;

					value = new ArrayList<String>();value.add(ap);
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:55:3: ( ',' ap= atomic_propositions )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==9) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:55:4: ',' ap= atomic_propositions
							{
							match(input,9,FOLLOW_9_in_prop358); 
							pushFollow(FOLLOW_atomic_propositions_in_prop364);
							ap=atomic_propositions();
							state._fsp--;

							value.add(ap);
							}
							break;

						default :
							break loop5;
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:57:1: atomic_propositions returns [String value] : ATOM_PROP ;
	public final String atomic_propositions() throws RecognitionException {
		String value = null;


		Token ATOM_PROP3=null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:58:3: ( ATOM_PROP )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:58:3: ATOM_PROP
			{
			ATOM_PROP3=(Token)match(input,ATOM_PROP,FOLLOW_ATOM_PROP_in_atomic_propositions380); 
			value = ATOM_PROP3	.getText();
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:61:1: neighbours returns [ArrayList<Integer> value] : (n= transitions )* ;
	public final ArrayList<Integer> neighbours() throws RecognitionException {
		ArrayList<Integer> value = null;


		int n =0;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:63:2: ( (n= transitions )* )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:63:4: (n= transitions )*
			{
			 value = new ArrayList<Integer>();
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:64:2: (n= transitions )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==NUM) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:64:5: n= transitions
					{
					pushFollow(FOLLOW_transitions_in_neighbours407);
					n=transitions();
					state._fsp--;

					 value.add(n); 
					}
					break;

				default :
					break loop7;
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
	// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:67:1: transitions returns [int value] : NUM ;
	public final int transitions() throws RecognitionException {
		int value = 0;


		Token NUM4=null;

		try {
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:68:3: ( NUM )
			// C:\\Users\\Simon\\Documents\\projectbase\\MA3\\transition_system\\parsing\\TransitionSystem.g:68:3: NUM
			{
			NUM4=(Token)match(input,NUM,FOLLOW_NUM_in_transitions426); 
			value = Integer.parseInt(NUM4.getText());
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



	public static final BitSet FOLLOW_ctlFormulaes_in_program51 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transitionSystem_in_ctlFormulaes76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_ctlFormulaes82 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes88 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_ctlFormulaes96 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes102 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ctlFormulaes104 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ATOM_PROP_in_ctlFormulaes106 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ctlFormulaes114 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes120 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ctlFormulaes128 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes134 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_ctlFormulaes142 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes148 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_ctlFormulaes156 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes162 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_ctlFormulaes170 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes176 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ctlFormulaes178 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes184 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_ctlFormulaes193 = new BitSet(new long[]{0x00000000003FF000L});
	public static final BitSet FOLLOW_ctlFormulaes_in_ctlFormulaes199 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_ctlFormulaes201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_state_in_transitionSystem223 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_transitionSystem240 = new BitSet(new long[]{0x0000000000300000L});
	public static final BitSet FOLLOW_state_in_transitionSystem244 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_20_in_state271 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUM_in_state273 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_initial_in_state277 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_state279 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_prop_in_state283 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_state285 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_neighbours_in_state289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_initial319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomic_propositions_in_prop352 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_prop358 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atomic_propositions_in_prop364 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ATOM_PROP_in_atomic_propositions380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transitions_in_neighbours407 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NUM_in_transitions426 = new BitSet(new long[]{0x0000000000000002L});
}
