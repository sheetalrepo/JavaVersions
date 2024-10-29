package E_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Optional
 * - May or May not be empty
 * - added in Java 8 to minimize null pointer exceptions
 * 
 * 
 * ofNullable()
 * - Non Null: Returns an Optional describing the given value
 * - Null: Otherwise returns an Empty Optional
 *
 * @author Sheetal Singh
 */
public class K_Optionals3 {

    /**
     * Optional.of()
     * Optional.empty()
     * Optional.ofNullable()
     */
    public static Optional<String> handleNullValue(String param) {
        //Both lines have same meaning
        Optional optReturn = (param == null) ? Optional.empty() : Optional.of(param); // Ternary Operator
        //Optional optReturn = Optional.ofNullable(param);
        return optReturn;
    }

    /**
     * 
     * ifPresent()
     * orElseGet()
     */
    public static void testOptional1() {
        Optional<String> optStr1 = handleNullValue("Prod Bug");
        //optStr1.ifPresent(System.out::println);
        optStr1.ifPresent(x -> System.out.println(x));
        
        
        Optional<String> optStr2 = handleNullValue(null);
        String str2 = optStr2.orElseGet(() -> "Empty optional Default Value");
        System.out.println(str2);
        System.out.println("============================================");
    }


    public static void testOptional2() {
        List<Integer> ls = Arrays.asList(2, 3, 0, 1, 1, 9, 8, 5, 26, 60);
        Optional<Integer> opt = ls.stream().filter(x -> x > 25).findFirst();

        if (opt.isPresent())
            System.out.println(opt.get());
        else {
            System.out.println("Nothing is present");
        }
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        testOptional1();
        testOptional2();
    }

}
