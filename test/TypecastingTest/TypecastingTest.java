package TypecastingTest;

import Evaluator.Types.Typecasting;
import static org.junit.Assert.*;
import org.junit.Test;

public class TypecastingTest {
    
    @Test
    public void castToTypeWithDoubleTest() {
        assertEquals(2.0, (Double)Typecasting.castToType(2.0).getValue(), 0.0);
    }
    
    @Test
    public void castToTypeWithIntegerTest() {
        assertEquals(2, (Integer)Typecasting.castToType(2).getValue(), 0);
    }
    
    @Test
    public void castToTypeWithStringTest() {
        assertEquals("hola", (String)Typecasting.castToType("hola").getValue());
    }
    
    @Test
    public void castToTypeWithBooleanTest() {
        assertEquals(true, (Boolean)Typecasting.castToType(true).getValue());
    }
    
}
