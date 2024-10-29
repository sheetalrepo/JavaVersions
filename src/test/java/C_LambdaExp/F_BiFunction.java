package C_LambdaExp;

import java.util.function.BiFunction;

/**
 * Interface BiFunction
 *    - Its a predefined Functional Interface in Java 8
 *          interface BiFunction<T, U, R>
 *    - It has single abstract method boolean and other default methods
 *          R apply(T t, U u);
 *    - package name: java.util.function.Function 
 *    - This is used to transform the input into output
 *    - apply() method takes input as Type T and return Type R
 *    
 *  @author Sheetal Singh  
 */
public class F_BiFunction {

    
    public static void main(String[] args) {
        
        //<T,U,R> <String, String, String>   R= Return
        BiFunction<String, String, String> obj1 = (x,y) -> x.concat(y);    // apply() method Implementation 
        String concat = obj1.apply("Will", " Smith");     
        System.out.println("Full Name: "+ concat);
        System.out.println("============================================");

        //<T,U,R> <Integer, Integer, Integer>   R= Return
        BiFunction<Integer, Integer, Integer> obj2 = (x,y) -> x*y;    // apply() method Implementation 
        Integer result = obj2.apply(10, 20);
        System.out.println("Mult: "+ result);
        System.out.println("============================================");

        
    }
}
