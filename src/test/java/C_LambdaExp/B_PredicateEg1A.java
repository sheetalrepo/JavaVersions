package C_LambdaExp;

import java.util.function.Predicate;

/**
 * Interface Predicate<T>
 *    - Its a predefined Functional Interface in Java 8
 *          interface Predicate<T> 
 *    - It has single abstract method boolean 
 *          boolean test(T t);
 *    - It also contains lots of default concrete methods  
 *    - package name: java.util.function.Predicate 
 *    
 *    
 *    @author Sheetal Singh
 */
public class B_PredicateEg1A {

    public static void main(String[] args) {
   
        //Predicate's test() method always return boolean value
        Predicate<Integer> obj1 = x -> x > 10; //test() method implementation given
        boolean flag1 = obj1.test(5);        //Calling Predicate Method "test"
        System.out.println("Is given number greate than 10: " + flag1);


        Predicate<String> obj2 = x -> x.startsWith("A"); //Implementation given
        boolean flag2 = obj2.test("Apple");            //Calling Predicate Method "test"
        System.out.println("Is word started with A: " + flag2);
        
        
        System.out.println("============================================");
    }
}
