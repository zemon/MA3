grammar TransitionSystem;

options {
  language = Java;
}

@header {
package transition_system.parsing;

import transition_system.ast.*;

}

@lexer::header {
package transition_system.parsing;

}

program returns [TS value]
    : s=transitionSystem EOF { $value = new TS(s); }
    ;

transitionSystem returns [ArrayList<State> value]
    : s=state      {$value = new ArrayList<State>(); $value.add(s); }
      ( '}' s=state { $value.add(s); } )*
    ;
 
state returns [State value]
    : '{' NUM i=initial '[' p=prop ']' n=neighbours {$value = new State(Integer.parseInt($NUM.getText()), i, p, n );}
     | {$value = null;}
    ;

initial returns  [boolean value]
	: '*' {$value = true;}
	|  {$value = false;}
	;

prop returns [ ArrayList<String> value]
	:  {$value = new ArrayList<String>(); $value.add("");}
	 |ap = atomic_propositions{$value = new ArrayList<String>();$value.add(ap);}
	 (',' ap = atomic_propositions{$value.add(ap);})*
	;
atomic_propositions returns [String value]
:	ID {$value = $ID.getText();}
	;

neighbours returns [ArrayList<Integer> value]
	
	: n=transitions { $value = new ArrayList<Integer>();$value.add(n);}
	(  n=transitions { $value.add(n); } )*
	;

transitions returns [int value]
:	NUM {$value = Integer.parseInt($NUM.getText());}

	;






NUM : '0'..'9'+ ;
ID  : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;
WS  :   (' '|'\t'|'\r'|'\n')+ { $channel = HIDDEN; } ;