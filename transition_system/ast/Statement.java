package transition_system.ast;

import transition_system.Environment;
import transition_system.VariableNotDefinedException;

public abstract class Statement {

	public abstract void evaluate(Environment env) throws VariableNotDefinedException;
	
}
