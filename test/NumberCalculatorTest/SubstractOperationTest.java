package NumberCalculatorTest;

import Evaluator.Calculator.Calculators.NumberCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubstractOperationTest {
    
    @Test
    public void substractDoubleWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(1.0, numberCalculator.substract(3.0, 2.0), 0.0);
        assertEquals(-5.0, numberCalculator.substract(-3.0, 2.0), 0.0);
        assertEquals(5.0, numberCalculator.substract(3.0, -2.0), 0.0);
        assertEquals(0.0, numberCalculator.substract(3.0, 3.0), 0.0);
    }
    
    @Test
    public void substractDoubleWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(1.0, numberCalculator.substract(3.0, 2), 0.0);
        assertEquals(-5.0, numberCalculator.substract(-3.0, 2), 0.0);
        assertEquals(5.0, numberCalculator.substract(3.0, -2), 0.0);
        assertEquals(0.0, numberCalculator.substract(3.0, 3), 0.0);
    }
    
    @Test
    public void substractIntegerWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(1.0, numberCalculator.substract(3, 2.0), 0.0);
        assertEquals(-5.0, numberCalculator.substract(-3, 2.0), 0.0);
        assertEquals(5.0, numberCalculator.substract(3, -2.0), 0.0);
        assertEquals(0.0, numberCalculator.substract(3, 3.0), 0.0);
    }
    
    @Test
    public void substractIntegerWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(1.0, numberCalculator.substract(3, 2), 0.0);
        assertEquals(-5.0, numberCalculator.substract(-3, 2), 0.0);
        assertEquals(5.0, numberCalculator.substract(3, -2), 0.0);
        assertEquals(0.0, numberCalculator.substract(3, 3), 0.0);
    }
}
