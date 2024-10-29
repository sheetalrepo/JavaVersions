package C_LambdaExp;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Interface UnaryOperator
 *    - It's a predefined Functional Interface in Java 8
 *          interface UnaryOperator<T> extends Function<T, T>     (*Imp)
 *    - It has single abstract method boolean and other default methods
 *          T apply(T t);
 *    - package name: java.util.function.Function 
 *    - This is used to transform the input into output
 *    - apply() method takes input as Type T and return Type T
 *    
 *    
 *    - Imp to note here is that both T are same  (*Imp)
 *    - in Function<T, R> Type T&R can be same or different
 *    - UnaryOperator Interface extends Function Interface
 *    
 *  @author Sheetal Singh  
 */
public class G_UnaryOperator {

    
    public static void main(String[] args) {
        
        //<T,R> <String, Integer>  T&R can be same or different
        Function<String, Integer> obj1 = x -> x.length();    // apply() method Implementation 
        int len = obj1.apply("Hello");      // x = Hello
        System.out.println("Length: "+ len);
        System.out.println("============================================");

        //T = String
        UnaryOperator<String> obj2 = x -> x.toUpperCase();
        String s = obj2.apply("Java 8");                    // apply() will take and return same Type T
        System.out.println("UnaryOperator: "+ s);
        System.out.println("============================================");

    }
}
