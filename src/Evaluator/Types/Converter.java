package Evaluator.Types;

public class Converter {

    public static Type castToType(Object value) {
        if (value instanceof Double) {
            return new DoubleType((Double) value);
        }
        if (value instanceof Integer) {
            return new IntegerType((Integer) value);
        }
        if (value instanceof String) {
            return new StringType((String) value);
        }
        if (value instanceof Boolean) {
            return new BooleanType((Boolean) value);
        }
        return null;
    }
    
}
