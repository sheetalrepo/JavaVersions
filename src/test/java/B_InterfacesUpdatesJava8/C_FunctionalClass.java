package B_InterfacesUpdatesJava8;

/**
 * 
 * Normal Process
 *  1. implement interface
 *  2. override in class
 *  3. create class object
 *  4. call interface method
 * 
 * @author Sheetal Singh
 */
public class C_FunctionalClass implements Testable3{    //step 1

    @Override
    public int singleAbstractMethod(int a) {      //step 2
        return a * a;
    }
    
    public static void main(String[] args) {
        C_FunctionalClass obj = new C_FunctionalClass();      //step 3
        int result = obj.singleAbstractMethod(10);                       //step 4
        System.out.println(result);
    }
}
