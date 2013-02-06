package sintaxtree;

public class ValueNode extends Node{
    
    public ValueNode(String symbol) {
        super(symbol);
    }

    @Override
    public boolean amIALeafNode() {
        return true;
    }
    
}
