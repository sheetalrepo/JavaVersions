package E_Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Operations on Primitive Streams
 *  1. Using OptionalInt, OptionalDouble etc
 *  2. Using IntSummaryStatistics
 * 
 * @author Sheetal Singh
 */
public class F1_IntSummaryStatics {

    /**
     * max()
     * min()
     *
     * Return Type: OptionalInt not Int
     */
    public static void primitiveOperationsMinMax(){
        OptionalInt max = IntStream.of(10, 20, 30)
                .max();  //min()
        max.ifPresent(System.out::println);                         // Method Reference
        max.ifPresent(x -> System.out.println("Max: "+ x));         // Lambda
        ///int a = IntStream.of(10, 20, 30).max();                   //Compiler Error
        System.out.println("============================================");
    }

    /**
     * average()
     */
    public static void primitiveOperationsAverage(){
        OptionalDouble avg = IntStream.of(10, 20, 30)
                .average();
        avg.ifPresent(x -> System.out.println("Avg: "+ x));
        System.out.println("============================================");
    }


    
    
    /**
     * IntSummaryStatistics
     *  - getMin
     *  - getMax
     *  - getAverage
     *  - getCount
     *  - getSum
     *  
     *  Refer
     *  C_CreatingStreamsOfPrimitives
     *     - primitiveOperationsMinMax
     *     
     *  Try 
     *      - DoubleSummaryStatistics
     *      - LongSummaryStatistics
     */
    public static void testIntSummaryStatistics() {
        IntStream intStream = IntStream.of(50, 100, 15, 20);
        //IntStream numbers = IntStream.of();  //for default values
        IntSummaryStatistics intStats = intStream.summaryStatistics(); // terminal op.
        
        int min = intStats.getMin();
        int max = intStats.getMax();
        double avg = intStats.getAverage();
        long count = intStats.getCount();
        long sum = intStats.getSum();

        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
        System.out.println(count);
        System.out.println(sum);
        
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        primitiveOperationsMinMax();
        primitiveOperationsAverage();
        testIntSummaryStatistics();
    }
}
