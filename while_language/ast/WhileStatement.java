package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class WhileStatement extends Statement{
	
	private BoolExpr condition;
	private Statement statement;
	
	public WhileStatement(BoolExpr condition, Statement statement) {
		this.condition = condition;
		this.statement = statement;
	}
	
	@Override
	public void evaluate(Environment env) throws VariableNotDefinedException {
		while(condition.evaluate(env)){
			statement.evaluate(env);
		}
	}

}
