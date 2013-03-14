package Evaluator.Nodes.Operations;

import Evaluator.Nodes.Node;
import Evaluator.Operators.Operator;

public abstract class Operation extends Node {
    
    private Operator operator;
    
    public Operation(Operator operator) {
        this.operator = operator;
    }
    
    public Boolean isABinaryOperator() {
        return operator.isBinary();
    }

    public Operator getOperator() {
        return operator;
    }
    
    public String getOperatorName() {
        return operator.getName();
    }
    
    public String getOperatorSymbol() {
        return operator.getSymbol();
    }
}
