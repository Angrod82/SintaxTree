package Nodes.BinaryOperators;

import Nodes.BinaryOperatorNode;
import Nodes.Node;

public class DivisionOperatorNode extends BinaryOperatorNode {
    
    public DivisionOperatorNode (Node leftSon, Node rightSon) {
        super(leftSon, rightSon);
    }

    @Override
    public double evaluate() {
        return getLeftSon().evaluate() / getRightSon().evaluate();
    }
    
}
