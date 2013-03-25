package Evaluator;

import Evaluator.Nodes.ConstantNode;
import Evaluator.Nodes.Node;
import Evaluator.Nodes.Operations.*;
import Evaluator.Operators.Operator;
import Evaluator.Operators.OperatorType;
import Evaluator.Types.*;
import static java.lang.System.out;

public class SintaxTree {
    
    public static void main(String[] args) {
        Node tres = new ConstantNode(new DoubleType(3.0));
        Node dos = new ConstantNode(new DoubleType(2.0));
        Node multiplicacion = new BinaryOperation(new Operator("multiply", "*", OperatorType.BINARY), tres, dos);
        Node uno = new ConstantNode(new IntegerType(1));
        Node suma = new BinaryOperation(new Operator("add", "+", OperatorType.BINARY), uno, multiplicacion);
        
        out.println(suma.evaluate().getValue());
    }
}
