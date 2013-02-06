package sintaxtree;

public class ConstantNode extends Node{
    
    private double contant;
    
    public ConstantNode(double constant) {
        this.contant = constant;
    }

    @Override
    public double evaluate() {
        return contant;
    }
    
}
