package B_InterfacesUpdatesJava8;

/**
 * Default Method
 * @author Sheetal Singh
 */
public class A_DefaultMethod implements Testable1 {
    @Override
    public void abstractMethodOld() {
        System.out.println("I am Normal Old Java 7 Method");
    }

    
    /* Not allowed
    @Override
    public static void staticMethodNew() {
        System.out.println("Static method introduced in Java8");
    }
    */

    public static void main(String[] args) {
        A_DefaultMethod obj = new A_DefaultMethod();
        obj.abstractMethodOld();
        obj.defaultMethodNew();
        
        Testable1.staticMethodNew();
        System.out.println("============================================");
        
        
        
        Testable1 testable = new A_DefaultMethod();
        testable.abstractMethodOld();
        testable.defaultMethodNew();
        System.out.println("============================================");
    }
    
}
