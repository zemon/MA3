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
    : s=ctlFormulaes EOF { $value = (s); }
    ;

ctlFormulaes returns [TS value]
:	s = transitionSystem {$value = new TS(s);}
	|'ctlTT(' ctl = ctlFormulaes ')' {$value = ctl ;}
	|'ctlAP(' ctl = ctlFormulaes ',' ATOM_PROP ')' {$value = ctl;$value.ctlAP($ATOM_PROP.getText());}
	|'ctlEX(' ctl = ctlFormulaes ')' {$value = ctl;$value.ctlEX($value.results);}
	|'ctlEF(' ctl = ctlFormulaes ')' {$value = ctl;$value.ctlEF($value.results);}
	|'ctlAX(' ctl = ctlFormulaes ')' {$value = ctl;$value.ctlAX($value.results);}
	|'ctlAG(' ctl = ctlFormulaes ')' {$value = ctl;$value.ctlAG($value.results);}
	|'ctlAnd(' ctl1 = ctlFormulaes ',' ctl2 = ctlFormulaes  ')' {$value = ctl;$value.ctlEX($value.results);}
	|'ctlNot(' ctl = ctlFormulaes ')' {$value = ctl;$value.ctlNot($value.results);}
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
:	ATOM_PROP {$value = $ATOM_PROP	.getText();}
	;

neighbours returns [ArrayList<Integer> value]
	
	: { $value = new ArrayList<Integer>();}
	(  n=transitions { $value.add(n); } )*
	;

transitions returns [int value]
:	NUM {$value = Integer.parseInt($NUM.getText());}

	;






NUM : '0'..'9'+ ;
ATOM_PROP  
	:	 ('a'..'z')* ;
WS  :   (' '|'\t'|'\r'|'\n')+ { $channel = HIDDEN; } ;