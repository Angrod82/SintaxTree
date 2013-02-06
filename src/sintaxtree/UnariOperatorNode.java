package sintaxtree;

public abstract class UnariOperatorNode extends Node{
    
    private Node son;

    public Node getSon() {
        return son;
    }

    public void setSon(Node son) {
        this.son = son;
    }
    
}
