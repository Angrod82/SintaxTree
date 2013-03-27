package OperationEvaluatorTest;

import Evaluator.Nodes.Operations.OperationEvaluator;
import Evaluator.Types.DoubleType;
import Evaluator.Types.Type;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class OperationEvaluatorTest {
    
    @Test
    public void executeTest() {
        try {
            Type mockArg1 = mock(Type.class);
            Type mockArg2 = mock(Type.class);
            when(mockArg1.getValue()).thenReturn(2.0);
            when(mockArg2.getValue()).thenReturn(3.0);
            Type result = OperationEvaluator.execute(mockArg1, mockArg2, "add");
            assertTrue(result instanceof DoubleType);
            assertEquals(5.0, (Double)result.getValue(), 0.0);
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException ex) {
            Logger.getLogger(OperationEvaluatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
