package transition_system;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import transition_system.ast.TS;
import transition_system.parsing.TransitionSystemLexer;
import transition_system.parsing.TransitionSystemParser;

public class TransitionSystem {

	public static void main(String args[]) throws Exception {
		if (args.length == 0) {
			System.out.println("Error: No program specified.");
			return;
		}
		
        TransitionSystemLexer lex = new TransitionSystemLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        TransitionSystemParser parser = new TransitionSystemParser(tokens);
        TS transitionSystem = parser.program();

        try {
//        	Environment env = new Environment();
//        	transitionSystem.evaluate(env);
        	System.out.println(transitionSystem.toString());
        } catch (Exception e) {
        	System.out.println("Error: " + e);
        }

	}
	
}
