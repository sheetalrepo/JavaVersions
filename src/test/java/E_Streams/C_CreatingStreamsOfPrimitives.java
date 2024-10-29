package E_Streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * 
 * #Two ways through which we can make Stream of Primitives
 *      - Arrays.stream(array)
 *      - IntStream.of(array)
 *
 * 
 * @author Sheetal Singh
 */

public class C_CreatingStreamsOfPrimitives {

    /**
     * IntStream
     *  - Arrays.stream(int[] arr)
     *  - IntStream.of(1,2,3)
     */
    public static void primitivesIntStream() {
        //Type 1
        int[] arrInt = {1, 2, 3, 4};
        IntStream iStream1 = Arrays.stream(arrInt);
        System.out.println("IntStream1: " + iStream1.count());
        
        //Type 2 - Better
        IntStream iStream2 = IntStream.of(1, 2, 3, 4, 5);
        System.out.println("IntStream2: " + iStream2.count());
        
        System.out.println("============================================");
    }


    public static void primitivesDoubleStream() {
        double[] arrDouble = {1.1, 2.2, 3.3};
        DoubleStream dStream1 = Arrays.stream(arrDouble);
        System.out.println("DoubleStream1: " + dStream1.count());

        DoubleStream dStream2 = DoubleStream.of(1.0, 2.5, 3.6, 4.5);
        System.out.println("DoubleStream2: " + dStream2.count());
        
        System.out.println("============================================");
    }


    public static void primitivesLongStream() {
        long[] arrLong = {1L, 2L, 3L};
        LongStream lStream1 = Arrays.stream(arrLong);
        System.out.println("LongStream1: " + lStream1.count());

        LongStream lStream2 = LongStream.of(4L, 5L, 6L, 7L);
        System.out.println("LongStream2: " + lStream2.count());
        System.out.println("============================================");
    }

   
    public static void main(String[] args) {
        //Create Streams
        primitivesIntStream();
        primitivesDoubleStream();
        primitivesLongStream();
    }

}
