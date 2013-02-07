package sintaxtree;

import Nodes.BinaryOperators.AddOperatorNode;
import Nodes.BinaryOperators.MultiplicationOperatorNode;
import Nodes.ConstantNode;
import Nodes.Node;
import static java.lang.System.out;

public class SintaxTree {

    public static void main(String[] args) {
        Node tres = new ConstantNode(3);
        Node dos = new ConstantNode(2);
        Node multiplicacion = new MultiplicationOperatorNode(dos, tres);
        Node uno = new ConstantNode(1);
        Node suma = new AddOperatorNode(uno, multiplicacion);
        
        out.println(suma.evaluate());
    }
}
