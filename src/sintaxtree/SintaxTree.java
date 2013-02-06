package sintaxtree;

public class SintaxTree {

    public static void main(String[] args) {
        Node tres = new ConstantNode(3);
        Node dos = new ConstantNode(2);
        Node multiplicacion = new MultiplicationOperatorNode(dos, tres);
        Node uno = new ConstantNode(1);
        Node suma = new AddOperatorNode(uno, multiplicacion);
        
        System.out.println(suma.evaluate());
    }
}
