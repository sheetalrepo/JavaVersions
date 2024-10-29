package C_LambdaExp;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * Interface BinaryOperator
 *    - It's a predefined Functional Interface in Java 8
 *          interface BinaryOperator<T> extends BiFunction<T,T,T>    (*Imp)
 *    - It has single abstract method boolean and other default methods
 *          T apply(T t);
 *    - package name: java.util.function.Function 
 *    - This is used to transform the input into output
 *    - apply() method takes input as Type T and return Type T
 *
 *
 *    - Imp to note here is that all T are same  (*Imp)
 *    - in BiFunction<T, U, R> Type T,U & R can be same or different
 *    - BinaryOperator is similar to BiFunction with all T as same
 *    
 *  @author Sheetal Singh  
 */
public class G_BinaryOperator {

    
    public static void main(String[] args) {
        
        //<T,U,R> <String, String, String>   R= Return
        BiFunction<String, String, String> obj1 = (x,y) -> x.concat(y);    // apply() method Implementation 
        String concat1 = obj1.apply("Will", " Smith");     
        System.out.println("Full Name using BiFunction: "+ concat1);
        System.out.println("============================================");

        //input, output is same type (String)
        BinaryOperator<String> obj2 = (x,y) -> x.concat(y);
        String concat2 = obj1.apply("Will", " Smith");
        System.out.println("Full Name using Binary Operator: "+ concat2);
        System.out.println("============================================");

        //input, output is same type (Integer)
        BinaryOperator<Integer> obj3 = (x,y) -> x/y;
        int result = obj3.apply(500, 50);
        System.out.println("Division using Binary Operator: "+ result);
        System.out.println("============================================");
        
    }
}
