package Types;

public class DoubleValue extends Value{
    
    private Double value;
    
    public DoubleValue (Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
    
}
