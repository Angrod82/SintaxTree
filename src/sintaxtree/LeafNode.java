package sintaxtree;

public class LeafNode extends Node{
    
    public LeafNode(String symbol) {
        super(symbol);
    }

    @Override
    public boolean amIALeafNode() {
        return true;
    }
    
}
