package sintaxtree;

public class FatherNode extends Node {
    
    private Node leftSon;
    private Node rightSon;
    
    public FatherNode(String symbol) {
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
