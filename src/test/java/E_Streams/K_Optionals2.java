package E_Streams;
import java.util.Optional;

/**
 * Optional
 *  -   isPresent() : Prevent from NoSuchElementException
 *  -   orElse() : Return NaN
 *  -   orElseGet(): Generate some new values
 * 
 * 
 * @author Sheetal Singh
 */
public class K_Optionals2 {

    public static Optional<Double> calculateAverage(int... numberList) {
        if (numberList.length == 0) {
            return Optional.empty();
        }

        int sum = 0;
        for (int n : numberList) {
            sum = sum + n;
        }

        Double avg = (double) sum / numberList.length;

        return Optional.of(avg);
    }

    /**
     * 
     * isPresent()
     *      - Prevent from NoSuchElementException
     * 
     */
    public static void testAverage1() {
        //NoSuchElementException
        Optional<Double> optAvg1 = calculateAverage(); //empty
        //System.out.println(optAvg1.get());
        
        
        Optional<Double> optAvg = calculateAverage(50, 60, 70);
        if (optAvg.isPresent()) {
            System.out.println(optAvg.get());
        }
        System.out.println("============================================");
    }


    /**
     * .orElse()
     *      - print the real value or else print NaN (Not a Number)
     *
     *  .orElseGet()
     *      - print the real value or else generate one    
     */
    public static void testAverage2() {
        Optional<Double> optAvg = calculateAverage(); //Empty list

        //Case 1: orElse
        System.out.println(optAvg.orElse(Double.NaN));

        //Case 2: orElseGet
        System.out.println(optAvg.orElseGet(() -> Math.random()));
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        testAverage1();
        testAverage2();
    }

}
