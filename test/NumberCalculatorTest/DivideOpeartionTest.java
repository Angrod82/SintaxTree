package NumberCalculatorTest;

import Evaluator.Calculator.Calculators.NumberCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivideOpeartionTest {
    
    @Test
    public void divideDoubleWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(1.5, numberCalculator.divide(3.0, 2.0), 0.0);
        assertEquals(-1.5, numberCalculator.divide(-3.0, 2.0), 0.0);
        assertEquals(-1.5, numberCalculator.divide(3.0, -2.0), 0.0);
        assertEquals(1.5, numberCalculator.divide(-3.0, -2.0), 0.0);
        assertEquals(1.0, numberCalculator.divide(3.0, 3.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, numberCalculator.divide(3.0, 0.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, numberCalculator.divide(-3.0, 0.0), 0.0);
    }
    
    @Test
    public void divideDoubleWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(1.5, numberCalculator.divide(3.0, 2), 0.0);
        assertEquals(-1.5, numberCalculator.divide(-3.0, 2), 0.0);
        assertEquals(-1.5, numberCalculator.divide(3.0, -2), 0.0);
        assertEquals(1.5, numberCalculator.divide(-3.0, -2), 0.0);
        assertEquals(1.0, numberCalculator.divide(3.0, 3), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, numberCalculator.divide(3.0, 0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, numberCalculator.divide(-3.0, 0), 0.0);
    }
    
    @Test
    public void divideIntegerWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(1.5, numberCalculator.divide(3, 2.0), 0.0);
        assertEquals(-1.5, numberCalculator.divide(-3, 2.0), 0.0);
        assertEquals(-1.5, numberCalculator.divide(3, -2.0), 0.0);
        assertEquals(1.5, numberCalculator.divide(-3, -2.0), 0.0);
        assertEquals(1.0, numberCalculator.divide(3, 3.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, numberCalculator.divide(3, 0.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, numberCalculator.divide(-3, 0.0), 0.0);
    }
    
    @Test
    public void dividetIntegerWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(2, numberCalculator.divide(4, 2), 0);
        assertEquals(-2, numberCalculator.divide(-4, 2), 0);
        assertEquals(-2, numberCalculator.divide(4, -2), 0);
        assertEquals(2, numberCalculator.divide(-4, -2), 0);
        assertEquals(1, numberCalculator.divide(3, 3), 0);
    }
}
