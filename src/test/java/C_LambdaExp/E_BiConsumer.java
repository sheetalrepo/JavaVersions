package C_LambdaExp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Interface Consumer
 *    - Its a predefined Functional Interface in Java 8
 *          interface BiConsumer<T, U>
 *    - It has single abstract method boolean 
 *          void accept(T t, U u);
 *    - package name: java.util.function.BiConsumer 
 *    - This is used to accept two values and will not return anything
 *    - Consumer will always consume things
 *    
 *  @author Sheetal Singh  
 */
public class E_BiConsumer {

    public static void main(String[] args) {
        //BiConsumer
        BiConsumer<String, Integer> obj1 = (x,y) -> System.out.println(x + " age is "+ y);    // BiConsumer Implementation 
        obj1.accept("John", 10);      
        System.out.println("============================================");

        //BiConsumer
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> obj2 = (x,y) -> map.put(x, y);    // BiConsumer Implementation 
        obj2.accept("Bob", 30);
        obj2.accept("Dan", 20);
        System.out.println(map);            
        System.out.println("============================================");
    }
}