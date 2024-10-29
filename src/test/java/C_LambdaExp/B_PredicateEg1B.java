package C_LambdaExp;

import java.util.function.Predicate;

/**
 * Predicate
 * 
 * @author Sheetal Singh
 */
public class B_PredicateEg1B {

    /**
     * Standard method create to accept 
     *  - Input of any type     
     *  - Predicate obj with some conditions
     */
    public static <T> boolean checkMe(T input, Predicate<T> predicate){
        return predicate.test(input);
    }

    private static void testInteger() {
        Predicate<Integer> obj1 = x -> x > 10; //Implementation given
        boolean flag1 = obj1.test(5);        //Calling Predicate Method "test" 
        System.out.println("Is given number greate than 10: " + flag1);

        Predicate<Integer> obj2 = x -> x > 10; //Implementation given
        boolean flag2 = checkMe(5, obj2); //Calling custom method
        System.out.println("Is given number greate than 10: " + flag2);
        System.out.println("============================================");
    }


    private static void testString() {
        Predicate<String> obj1 = x -> x.startsWith("A"); //Implementation given
        boolean flag1 = obj1.test("Apple");            //Calling predicate method
        System.out.println("Is word started with A: " + flag1);


        Predicate<String> obj2 = x -> x.startsWith("A"); //Implementation given
        boolean flag2 = checkMe("Apple", obj2);     //Calling custom method
        System.out.println("Is word started with A: " + flag2);
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        testInteger();
        testString();
        
    }


}
