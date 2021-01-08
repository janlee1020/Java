
/**
 * Operator nodes are the internal nodes of a binary expression tree.
 * 
 * @author Janet Lee
 * @version 4/23/2020
 */
public class OperatorNode extends ExpressionNode {

  private Operator op;

  public OperatorNode(Operator op) {
    super();
    this.op = op;
  }

  public OperatorNode(Operator op, ExpressionNode left, ExpressionNode right) {
    super(left, right);
    this.op = op;
  }

  /**
   * Evaluate the expression rooted at this node and return the result.
   */
  @Override
  public double evaluate() {
    double result = 0;
    if (op.opString() == "*") {
      result = left().evaluate() * right().evaluate();
    }
    else if (op.opString() == "/") {
      result = left().evaluate() / right().evaluate();
    }
    else if (op.opString() == "+") {
      result = left().evaluate() + right().evaluate();
    }
    else if (op.opString() == "-") {
      result = left().evaluate() - right().evaluate();
    }
    
    return result;

  }

  @Override
  public String postfixString() {
    String left, right;
    left = left().postfixString();
    right = right().postfixString();
    return left + right + op.opString() ;
  }

  @Override
  public String prefixString() {
    String left, right;
    left = left().postfixString();
    right = right().postfixString();
    return op.opString() + left + right;
  }

  @Override
  public String infixString() {
    String left, right;
    left = left().postfixString();
    right = right().postfixString();
    return left + op.opString() + right ;
  }
}

