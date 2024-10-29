package C_LambdaExp;

import java.util.function.Consumer;

/**
 * Interface Consumer
 *    - Its a predefined Functional Interface in Java 8
 *          interface Consumer<T>
 *    - It has single abstract method boolean 
 *          void accept(T t);
 *    - package name: java.util.function.Consumer 
 *    - This is used to accept values and will not return anything i.e Consumer
 *    - Consumer will always consume things
 *    
 *  @author Sheetal Singh  
 */
public class E_Consumer {

    
    public static void main(String[] args) {
        Consumer<String> obj1 = x -> System.out.println(x);    // Consumer Implementation 
        obj1.accept("Hello");      // x = Hello
        System.out.println("============================================");


        Consumer<String> obj2 = x -> System.out.println(x.toUpperCase());    // Consumer Implementation 
        obj2.accept("World");      // x = World
        System.out.println("============================================");


        Consumer<Integer> obj3 = x -> System.out.println(x*x);    // Consumer Implementation 
        obj3.accept(20);      // x = 20
        System.out.println("============================================");
    }
}
