package sintaxtree;

public class ConstantNode extends Node{
    
    private double value;
    
    public ConstantNode(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
    
}
