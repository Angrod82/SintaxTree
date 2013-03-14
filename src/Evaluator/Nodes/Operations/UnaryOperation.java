package Evaluator.Nodes.Operations;

import Evaluator.Nodes.Node;
import Evaluator.Operators.Operator;
import Evaluator.Types.Type;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnaryOperation extends Operation {
    
    private Node son;
    
    public UnaryOperation(Operator operator) {
        super(operator);
    }

    public Node getSon() {
        return son;
    }

    public void setSon(Node son) {
        this.son = son;
    }
    
    public Object getValueSon() {
        return son.evaluate().getValue();
    }

    @Override
    public Type evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
