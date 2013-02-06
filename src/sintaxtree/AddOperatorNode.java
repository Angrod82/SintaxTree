package sintaxtree;

public class AddOperatorNode extends BinaryOperatorNode{
    
    public AddOperatorNode(Node leftSon, Node rightSon) {
        super(leftSon,rightSon);
    }

    @Override
    public double evaluate() {
        return getLeftSon().evaluate() + getRighSon().evaluate();
    }
    
}
