package C_LambdaExp;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Interface BiPredicate<T, U>
 *    - Its a predefined Functional Interface in Java 8
 *          interface BiPredicate<T, U>
 *    - It has single abstract method boolean 
 *          boolean test(T t, U u);
 *    - It also contains lots of default concrete methods  
 *    - package name: java.util.function.BiPredicate 
 *    - Its exact same copy of Predicate, just with 2 params
 *    
 *  @author Sheetal Singh
 */
public class C_BiPredicateEg {

    public static void main(String[] args) {
        //Predicate
        Predicate<String> obj1 = x -> x.length() >= 10;   //test() method implementation given | hardcoded 10
        boolean flag1 = obj1.test("alpha city");        //Calling Predicate Method "test"
        System.out.println("Is given word length is >=10: " + flag1);

        //BiPredicate
        BiPredicate<String, Integer> obj2 = (x,y) -> x.length() >= y;        //Implementation given
        boolean flag2 = obj2.test("alpha city", 10);                    //Calling BiPredicate Method "test"
        System.out.println("Is given word length is >=10: " + flag2);
        
        System.out.println("============================================");
    }
}
