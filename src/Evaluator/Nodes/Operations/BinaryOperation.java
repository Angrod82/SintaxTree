package Evaluator.Nodes.Operations;

import Evaluator.Nodes.Node;
import Evaluator.Operators.Operator;
import Evaluator.Types.Type;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryOperation extends Operation {
    
    private Node leftSon, rightSon;
    
    public BinaryOperation(Operator operator, Node leftson, Node rightson) {
        super(operator);
        this.leftSon = leftson;
        this.rightSon = rightson;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }
    
    public Object getValueLeftSon() {
        return leftSon.evaluate().getValue();
    }
    
    public Object getValueRightSon() {
        return rightSon.evaluate().getValue();
    }

    @Override
    public Type evaluate() {
        try {
            Type leftSon = this.leftSon.evaluate();
            Type rightSon = this.rightSon.evaluate();
            return OperationEvaluator.execute(leftSon, rightSon, getOperatorName());
        } catch (InstantiationException | SecurityException | IllegalAccessException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
