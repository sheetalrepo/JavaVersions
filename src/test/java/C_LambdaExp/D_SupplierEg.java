package C_LambdaExp;

import java.time.LocalTime;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Interface Supplier
 *    - It's a predefined Functional Interface in Java 8
 *          Supplier<T>
 *    - It has single abstract method boolean 
 *          T get();
 *    - There is no default concrete methods in this interface  
 *    - package name: java.util.function.Supplier 
 *    - This is used to get values
 *    
 *  @author Sheetal Singh  
 */
public class D_SupplierEg {

    private static void supplierStringBuilder() {
        //Predicate
        Predicate<String> obj1 = x -> x.startsWith("A"); //get() method implementation
        boolean flag1 = obj1.test("Apple");            //Calling Predicate Method "test"
        System.out.println("Is word started with A: " + flag1);
        System.out.println("============================================");

        //Supplier
        Supplier<StringBuilder> obj2 = () -> new StringBuilder(); // T = StringBuilder
        StringBuilder sb1 = obj2.get().append("Hello");   // get() will return Type T i.e. StringBuilder
        System.out.println(sb1);

        StringBuilder sb2 = sb1.append(" World");
        System.out.println(sb2);

        System.out.println("============================================");
    }

    private static void supplierLocalTime() {
       
        //Supplier
        Supplier<LocalTime> obj1 = () -> LocalTime.now(); // T = LocalTime
        LocalTime localTime = obj1.get();   // get will return Type T i.e. LocalTime
        System.out.println(localTime);

        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        supplierStringBuilder();
        supplierLocalTime();
    }
}
