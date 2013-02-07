package Nodes;

import Nodes.Node;

public abstract class BinaryOperatorNode extends OperatorNode{
    
    private Node leftSon;
    private Node righSon;
    
    public BinaryOperatorNode(Node leftSon, Node rightSon) {
        this.leftSon = leftSon;
        this.righSon = rightSon;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getRightSon() {
        return righSon;
    }

    public void setRighSon(Node righSon) {
        this.righSon = righSon;
    }
    
}
