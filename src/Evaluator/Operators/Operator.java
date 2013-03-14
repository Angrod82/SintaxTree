package Evaluator.Operators;

public class Operator {
    
    private String name;
    private String symbol;
    private OperatorType type;
    
    public Operator(String name, String symbol, OperatorType type) {
        this.name = name;
        this.symbol = symbol;
        this.type = type;
    }
    
    public Boolean isBinary() {
        return type.equals(OperatorType.BINARY);
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public OperatorType getType() {
        return type;
    }
    
}
