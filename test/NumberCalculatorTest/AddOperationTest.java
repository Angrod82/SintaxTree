package NumberCalculatorTest;

import Evaluator.Calculator.Calculators.NumberCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddOperationTest {
    
    @Test
    public void addDoubleWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(5.0, numberCalculator.add(3.0, 2.0), 0.0);
        assertEquals(-1.0, numberCalculator.add(-3.0, 2.0), 0.0);
        assertEquals(0.0, numberCalculator.add(3.0, -3.0), 0.0);
    }
    
    @Test
    public void addDoubleWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(5.0, numberCalculator.add(3.0, 2), 0.0);
        assertEquals(-1.0, numberCalculator.add(-3.0, 2), 0.0);
        assertEquals(0.0, numberCalculator.add(3.0, -3), 0.0);
    }
    
    @Test
    public void addIntegerWithDoubleTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(5.0, numberCalculator.add(3, 2.0), 0.0);
        assertEquals(-1.0, numberCalculator.add(-3, 2.0), 0.0);
        assertEquals(0.0, numberCalculator.add(3, -3.0), 0.0);
    }
    
    @Test
    public void addIntegerWithIntegerTest() {
        NumberCalculator numberCalculator = new NumberCalculator();
        assertEquals(5, numberCalculator.add(3, 2), 0);
        assertEquals(-1, numberCalculator.add(-3, 2), 0);
        assertEquals(0, numberCalculator.add(3, -3), 0);
    }
    
}
