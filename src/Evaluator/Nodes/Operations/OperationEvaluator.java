package Evaluator.Nodes.Operations;

import Evaluator.Calculator.*;
import Evaluator.Types.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OperationEvaluator {
    
    private static Calculator searchCalculator(Type arg1, Type arg2) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if(arg1.getValue() instanceof Double && arg2.getValue() instanceof Double)
            return (Calculator)Class.forName("Evaluator.Calculator.NumberCalculator").newInstance();
        if(arg1.getValue() instanceof Double && arg2.getValue() instanceof Integer)
            return (Calculator)Class.forName("Evaluator.Calculator.NumberCalculator").newInstance();
        if(arg1.getValue() instanceof Integer && arg2.getValue() instanceof Double)
            return (Calculator)Class.forName("Evaluator.Calculator.NumberCalculator").newInstance();
        if(arg1.getValue() instanceof Integer && arg2.getValue() instanceof Integer)
            return (Calculator)Class.forName("Evaluator.Calculator.NumberCalculator").newInstance();
        return null;
    }
    
    private static Method searchMethod(Type arg1, Type arg2, String operatorName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException {
        return searchCalculator(arg1, arg2).getClass().getMethod(operatorName, arg1.getValue().getClass(), arg2.getValue().getClass());
    }
    
    public static Type execute(Type arg1, Type arg2, String operatorName) throws ClassNotFoundException, InstantiationException, SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Converter.castToType(searchMethod(arg1, arg2, operatorName).invoke(searchCalculator(arg1, arg2), arg1.getValue(), arg2.getValue()));
    }
    
}
