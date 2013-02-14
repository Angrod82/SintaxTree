import Nodes.BinaryOperators.SubtractionOperatorNode;
import Nodes.ConstantNode;
import Nodes.Node;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionOperatorTest {
    
    @Test
    public void SubtractionOperatorTestTwoSubtractionFour() {
        Node tow = new ConstantNode(2);
        Node four = new ConstantNode(4);
        Node subtraction = new SubtractionOperatorNode(tow, four);
        Assert.assertEquals(-2.0, subtraction.evaluate(), 0.0);
    }
    
    @Test
    public void SubtractionOperatorTestMinusTwoSubtractionMinusFour() {
        Node tow = new ConstantNode(-2);
        Node four = new ConstantNode(-4);
        Node subtraction = new SubtractionOperatorNode(tow, four);
        Assert.assertEquals(2.0, subtraction.evaluate(), 0.0);
    }
    
    @Test
    public void SubtractionOperatorTestTwoSubtractionZero() {
        Node tow = new ConstantNode(2);
        Node zero = new ConstantNode(0);
        Node subtraction = new SubtractionOperatorNode(tow, zero);
        Assert.assertEquals(2.0, subtraction.evaluate(), 0.0);
    }
}
