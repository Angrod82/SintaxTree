import Nodes.BinaryOperators.AddOperatorNode;
import Nodes.ConstantNode;
import Nodes.Node;
import org.junit.Assert;
import org.junit.Test;

public class AddOperatorTest {
    
    @Test
    public void AddOperatorTestTwoAddFour() {
        Node two = new ConstantNode(2);
        Node four = new ConstantNode(4);
        Node add = new AddOperatorNode(two, four);
        Assert.assertEquals(6.0, add.evaluate(), 0.0);
    }
    
    @Test
    public void AddOperatorTestZeroAddZero() {
        Node zero = new ConstantNode(0);
        Node add = new AddOperatorNode(zero, zero);
        Assert.assertEquals(0.0, add.evaluate(), 0.0);
    }
    
    @Test
    public void AddOperatorTestTwoAddMinusFour() {
        Node tow = new ConstantNode(2);
        Node minusFour = new ConstantNode(-4);
        Node add = new AddOperatorNode(tow, minusFour);
        Assert.assertEquals(-2.0, add.evaluate(), 0.0);
    }
}
