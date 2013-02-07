package Nodes;

import Nodes.Node;

public abstract class UnaryOperatorNode extends Node{
    
    private Node son;

    public Node getSon() {
        return son;
    }

    public void setSon(Node son) {
        this.son = son;
    }
    
}
