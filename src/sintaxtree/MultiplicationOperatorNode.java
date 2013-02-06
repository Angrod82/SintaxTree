package sintaxtree;

public class MultiplicationOperatorNode extends BinaryOperatorNode{
    
    public MultiplicationOperatorNode(Node leftSon, Node rightSon) {
        super(leftSon,rightSon);
    }

    @Override
    public double evaluate() {
        return getLeftSon().evaluate() * getRighSon().evaluate();
    }
    
}
