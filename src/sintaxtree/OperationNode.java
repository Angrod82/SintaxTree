package sintaxtree;

public class OperationNode extends Node {
    
    private Node leftSon;
    private Node rightSon;
    
    public OperationNode(String symbol) {
        super(symbol);
        leftSon = null;
        rightSon = null;
    }

    @Override
    public boolean amIALeafNode() {
        return false;
    }

    public Node getLeftSon() {
        return leftSon;
    }
    
    public Node getRightSon() {
        return rightSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }
    
}
