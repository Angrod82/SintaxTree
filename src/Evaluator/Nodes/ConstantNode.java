package Evaluator.Nodes;

import Evaluator.Types.Type;

public class ConstantNode extends Node{
    
    private Type constant;
    
    public ConstantNode(Type constant) {
        this.constant = constant;
    }

    @Override
    public Type evaluate() {
        return constant;
    }
    
}
