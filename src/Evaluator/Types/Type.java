package Evaluator.Types;

public abstract class Type<Type> {

    private Type value;
    
    public Type(Type value) {
        this.value = value;
    }
    
    public Type getValue() {
        return this.value;
    }
}
