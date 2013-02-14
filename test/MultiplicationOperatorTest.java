import Nodes.BinaryOperators.MultiplicationOperatorNode;
import Nodes.ConstantNode;
import Nodes.Node;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationOperatorTest {
    
    @Test
    public void MultiplicactionOperatorTestTwoAddFour() {
        Node two = new ConstantNode(2);
        Node four = new ConstantNode(4);
        Node multiplication = new MultiplicationOperatorNode(two, four);
        Assert.assertEquals(8.0, multiplication.evaluate(), 0.0);
    }
    
    @Test
    public void MultiplicactionOperatorTestTwoAddZero() {
        Node two = new ConstantNode(2);
        Node zero = new ConstantNode(0);
        Node multiplication = new MultiplicationOperatorNode(two, zero);
        Assert.assertEquals(0.0, multiplication.evaluate(), 0.0);
    }
    
    @Test
    public void MultiplicactionOperatorTestTwoAddMinusOne() {
        Node two = new ConstantNode(2);
        Node minusOne = new ConstantNode(-1);
        Node multiplication = new MultiplicationOperatorNode(two, minusOne);
        Assert.assertEquals(-2.0, multiplication.evaluate(), 0.0);
    }
}
