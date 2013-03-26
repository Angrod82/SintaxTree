package Evaluator;

import Evaluator.Nodes.ConstantNode;
import Evaluator.Nodes.Node;
import Evaluator.Nodes.Operations.*;
import Evaluator.Operators.Operator;
import Evaluator.Operators.OperatorType;
import Evaluator.Types.*;
import java.io.File;
import static java.lang.System.out;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SintaxTree {
    
    public static final Map<String, Method> signatureHashMap = new HashMap<>();
    
    static {
        try {
            Class[] classes = getClasses("Evaluator.Calculator.Calculators");
            for (Class clazz : classes) {
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Evaluator.Annotations.Operation.class)) {
                        Evaluator.Annotations.Operation annotation = method.getAnnotation(Evaluator.Annotations.Operation.class);
                        signatureHashMap.put(annotation.signature(), method);
                    }
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SintaxTree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Class[] getClasses(String packageName) throws ClassNotFoundException {
        ArrayList<Class> classes = new ArrayList<>();
        File directory = null;
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            if (classLoader == null) {
                throw new ClassNotFoundException("Can't get class loader.");
            }
            String path = "\\" + packageName.replace(".", "\\");
            URL resource = classLoader.getResource(path);
            if (resource == null) {
                throw new ClassNotFoundException("No resource for " + path);
            }
            directory = new File(resource.getFile().replace("%5c", "\\"));
        }
        catch (NullPointerException ex) {
            throw new ClassNotFoundException(packageName + " (" + directory + ") does not appear to be a valid package");
        }
        if (directory.exists()) {
            String[] files = directory.list();
            for (String file : files) {
                if (file.endsWith(".class")) {
                    classes.add(Class.forName(packageName + '.' + file.substring(0, file.length() - 6)));
                }
            }
        }
        else {
            throw new ClassNotFoundException(packageName + " does not appear to be a valid package");
        }
        Class[] classesA = new Class[classes.size()];
        return classes.toArray(classesA);
    }
    
    public static void main(String[] args) {
        
        Node tres = new ConstantNode(new DoubleType(3.0));
        Node dos = new ConstantNode(new DoubleType(2.0));
        Node multiplicacion = new BinaryOperation(new Operator("multiply", "*", OperatorType.BINARY), tres, dos);
        Node uno = new ConstantNode(new IntegerType(1));
        Node suma = new BinaryOperation(new Operator("add", "+", OperatorType.BINARY), uno, multiplicacion);
        
        out.println(suma.evaluate().getValue());
    }

}
