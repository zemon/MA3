package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class PlusExpr extends ArithExpr {

	private ArithExpr expression1;
	private ArithExpr expression2;
	
	public PlusExpr(ArithExpr expression1, ArithExpr expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return expression1.evaluate(env) + expression2.evaluate(env);
	}

}
