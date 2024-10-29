package B_InterfacesUpdatesJava8;

/**
 * 
 * Functional Interface
 * 
 * @author Sheetal Singh
 */
public class D_FunctionalClassNew {
    public static void main(String[] args) {
        Testable3 obj = (int x) -> x*x;            //Step 1    
        //Testable3 obj = x -> x*x;
        int result = obj.singleAbstractMethod(10);     //Step 2
        System.out.println(result);
    }
}
