package D_MethodRef;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *  Method Reference:
 *      Bound Type
 * 
 *  Method Ref converted to Lambda by compiler behind the scene 
 * 
 * @author Sheetal Singh
 */
public class B_MethodRefBound {

    /**
     * Interface Supplier<T> 
     *      T get()   
     * 
     */
    public static void boundMethodReferences1(){
        String str = "We Are Learning JAVA Method Reference ";
        //Supplier<T>         
        Supplier<String> obj1Lambda   = () -> str.toLowerCase();   // lambda
        Supplier<String> obj2MR  = str::toLowerCase;               // method reference, no bracket() in method name

        // Supplier is bound to "str"            
        System.out.println(obj1Lambda.get());  //obj.get() will automatically pick "str" as they are bound
        System.out.println(obj2MR.get());
        System.out.println("============================================");
    }

    /**
     *  interface Predicate<T>
     *      boolean test(T t)
     */
    public static void boundMethodReferences2(){
        String str = "We Are Learning JAVA Method Reference ";
       
        Predicate<String> titleL  = (title) -> str.contains(title);
        Predicate<String> titleMR = str::contains;

        System.out.println(titleL.test("JAVA")); // true
        System.out.println(titleMR.test("JAVA"));// true
        System.out.println("============================================");
    }
    
    
    public static void main(String[] args) {
        boundMethodReferences1();
        boundMethodReferences2();
    }
}
