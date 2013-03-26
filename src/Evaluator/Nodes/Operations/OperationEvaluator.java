package Evaluator.Nodes.Operations;

import Evaluator.SintaxTree;
import Evaluator.Types.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OperationEvaluator {
    
    private static Method searchMethod(Type arg1, Type arg2, String operatorName) {
        return SintaxTree.signatureHashMap.get(operatorName + arg1.getValue().getClass().getSimpleName() + arg2.getValue().getClass().getSimpleName());
    }
    
    public static Type execute(Type arg1, Type arg2, String operatorName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        Method method = searchMethod(arg1, arg2, operatorName);
        return Converter.castToType(method.invoke(method.getDeclaringClass().newInstance(), arg1.getValue(), arg2.getValue()));
    }
    
}
