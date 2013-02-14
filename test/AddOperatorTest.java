import Nodes.BinaryOperators.AddOperatorNode;
import Nodes.ConstantNode;
import Nodes.Node;
import org.junit.Assert;
import org.junit.Test;

public class AddOperatorTest {
    
    @Test
    public void AddOperatorTestTwoAddFour() {
        Node tow = new ConstantNode(2);
        Node four = new ConstantNode(4);
        Node add = new AddOperatorNode(tow, four);
        Assert.assertEquals(6.0, add.evaluate(), 0.0);
    }
}
