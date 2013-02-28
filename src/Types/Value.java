package Types;

public abstract class Value<Type> {

    private Type value;
    
    public Value(Type value) {
        this.value = value;
    }
    
    public Type getValue() {
        return this.value;
    }
}
