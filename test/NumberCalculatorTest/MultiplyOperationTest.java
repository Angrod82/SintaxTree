package NumberCalculatorTest;

import Evaluator.Calculator.Calculators.NumberCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplyOperationTest {
    
    @Test
    public void multiplyDoubleWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(6.0, numberCalculator.multiply(3.0, 2.0), 0.0);
        assertEquals(-6.0, numberCalculator.multiply(-3.0, 2.0), 0.0);
        assertEquals(0.0, numberCalculator.multiply(3.0, 0.0), 0.0);
        assertEquals(6.0, numberCalculator.multiply(-3.0, -2.0), 0.0);
    }
    
    @Test
    public void multiplyDoubleWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(6.0, numberCalculator.multiply(3.0, 2), 0.0);
        assertEquals(-6.0, numberCalculator.multiply(-3.0, 2), 0.0);
        assertEquals(0.0, numberCalculator.multiply(3.0, 0), 0.0);
        assertEquals(6.0, numberCalculator.multiply(-3.0, -2), 0.0);
    }
    
    @Test
    public void multiplyIntegerWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(6.0, numberCalculator.multiply(3, 2.0), 0.0);
        assertEquals(-6.0, numberCalculator.multiply(-3, 2.0), 0.0);
        assertEquals(0.0, numberCalculator.multiply(3, 0.0), 0.0);
        assertEquals(6.0, numberCalculator.multiply(-3, -2.0), 0.0);
    }
    
    @Test
    public void multiplyIntegerWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(6, numberCalculator.multiply(3, 2), 0);
        assertEquals(-6, numberCalculator.multiply(-3, 2), 0);
        assertEquals(0, numberCalculator.multiply(3, 0), 0);
        assertEquals(6, numberCalculator.multiply(-3, -2), 0);
    }
    
}
