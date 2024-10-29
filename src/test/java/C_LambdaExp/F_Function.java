package C_LambdaExp;

import java.util.function.Function;

/**
 * Interface Function
 *    - Its a predefined Functional Interface in Java 8
 *          interface Function<T, R>
 *    - It has single abstract method boolean and other default methods
 *          R apply(T t);
 *    - package name: java.util.function.Function 
 *    - This is used to transform the input into output
 *    - apply() method takes input as Type T and return Type R
 *    
 *  @author Sheetal Singh  
 */
public class F_Function {

    
    public static void main(String[] args) {
        
        //T=String, R=Integer
        Function<String, Integer> obj1 = x -> x.length();    // apply() method Implementation 
        int len = obj1.apply("Hello");      // x = Hello
        System.out.println("Length: "+ len);
        System.out.println("============================================");


        //T=Integer, R=Integer
        Function<Integer, Integer> obj2 = x -> x*x;    // apply() method Implementation 
        int square = obj2.apply(10);      // x = 10
        System.out.println("Square: "+ square);
        System.out.println("============================================");


    }
}
