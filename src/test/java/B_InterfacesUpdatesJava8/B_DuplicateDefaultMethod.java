package B_InterfacesUpdatesJava8;

/**
 * Both interface having same default method name
 *   - methodWithBody()
 *   
 *  @author Sheetal Singh
 */
public class B_DuplicateDefaultMethod implements Testable1, Testable2 {

    /**
     * 3 options to use
     */
    @Override
    public void defaultMethodNew() {
        //Testable1.super.methodWithBody();
        //Testable2.super.methodWithBody();
        System.out.println("Class own implementation");
    }
    
    @Override
    public void abstractMethodOld() {
        //Normal Method
    }

    
    public static void main(String[] args) {
        B_DuplicateDefaultMethod obj = new B_DuplicateDefaultMethod();
        obj.defaultMethodNew();
    }
    
}
