package D_MethodRef;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;

/**
 * Method Reference:
 *  - Method reference is used to refer method of functional interface
 *  - It is compact and easy form of lambda expression
 *  - Each time when you are using lambda expression to just referring a method, 
 *         you can replace your lambda expression with method reference.
 *  
 * @author Sheetal Singh
 */
public class A_MethodRefBasics {

    /**
     * Consumer: Consumer used to accept values and will not return anything i.e. Consumer
     */
    public static void consumerEg() {
        Consumer<String> obj1 = x -> System.out.println(x);    // Consumer Implementation 
        obj1.accept("Hello");      // x = Hello
        System.out.println("============================================");
    }
    

    /**
     * Method ref ::
     * Types:
     *  1. Bound (Compile Time)
     *  2. Unbound (Runtime)
     *  3. Static
     *  4. Constructor
     * 
     */
    public static void basicMethodReference1() {
        //Lambda forEach(Consumer)
        List<String> list1 = Arrays.asList("A","B","C");
        list1.forEach(x -> System.out.println(x));
        System.out.println("============================================");
        
        //Method Ref
        List<String> list2 = Arrays.asList("X","Y","Z");
        list2.forEach(System.out::println);    // Lambda x-> has been removed 
        System.out.println("============================================");
    }


    public static void basicMethodReference2() {
        
        //Lambda
        List<String> list1 = Arrays.asList("apple", "mango", "orange");
        System.out.println("Original List: "+list1);
        list1.forEach(x -> System.out.println("First Letter Capital: "+StringUtils.capitalize(x)));
        list1.forEach(x -> System.out.println("All Capital: "+x.toUpperCase())); // All in Capital
        System.out.println("============================================");


        //Method Ref
        List<String> list2 = Arrays.asList("apple", "mango", "orange");
        System.out.println("Method Ref Original List: "+list1);
        list1.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("============================================");
        
        
        list1.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        //consumerEg();
        basicMethodReference1();
        basicMethodReference2();
    }
}
