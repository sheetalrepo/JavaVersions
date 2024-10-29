package E_Streams;
import java.util.Optional;

/**
 * Optional 
 *  - May or May not be empty
 *  - added in Java 8 to minimize null pointer exceptions
 * 
 * 
 * ofNullable()
 *  - Non Null: Returns an Optional describing the given value
 *  - Null: Otherwise returns an Empty Optional
 * 
 * @author Sheetal Singh
 */
public class K_Optionals1 {
    /**
     * NPE
     */
    public static void testUpperCase1() {
        String[] strArray = new String[10];
        String upCase = strArray[1].toUpperCase();
        System.out.print(upCase);
        System.out.println("============================================");
    }

    /**
     * NPE saved using Optional
     * 
     * ofNullable()
     */
    public static void testUpperCase2() {
        String[] strArray = new String[10];
        Optional<String> check = Optional.ofNullable(strArray[1]);

        if (check.isPresent()) {
            String upCase = strArray[1].toUpperCase();
            System.out.print(upCase);
        } else
            System.out.println("String value is not present");

        System.out.println("============================================");
    }

    public static void main(String[] args) {
        testUpperCase1();
        testUpperCase2();
    }

}
