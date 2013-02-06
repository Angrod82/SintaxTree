package sintaxtree;

public abstract class Node {
    
    private String symbol;
    
    public Node(String symbol) {
        this.symbol = symbol;
    }
    
    public abstract boolean amIALeafNode();
}
