import Nodes.BinaryOperators.DivisionOperatorNode;
import Nodes.ConstantNode;
import Nodes.Node;
import org.junit.Assert;
import org.junit.Test;

public class DivisionOperatorTest {
    
    @Test
    public void DivisionOperatorTestTwoDivisionFour() {
        Node two = new ConstantNode(2);
        Node four = new ConstantNode(4);
        Node division = new DivisionOperatorNode(two, four);
        Assert.assertEquals(0.5, division.evaluate(), 0.0);
    }
    
    @Test
    public void DivisionOperatorTestZeroDivisionTwo() {
        Node two = new ConstantNode(2);
        Node zero = new ConstantNode(0);
        Node division = new DivisionOperatorNode(zero, two);
        Assert.assertEquals(0, division.evaluate(), 0.0);
    }
    
    @Test
    public void DivisionOperatorTesttwoDivisionTwo() {
        Node two = new ConstantNode(2);
        Node division = new DivisionOperatorNode(two, two);
        Assert.assertEquals(1, division.evaluate(), 0.0);
    }
    
    @Test
    public void DivisionOperatorTestTwoDivisionZero() {
        Node two = new ConstantNode(2);
        Node zero = new ConstantNode(0);
        Node division = new DivisionOperatorNode(two, zero);
        Assert.assertEquals(Double.POSITIVE_INFINITY, division.evaluate(), 0.0);
    }
}
