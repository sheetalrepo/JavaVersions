package E_Streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author Sheetal Singh
 */
public class D_CreatingStreamsFromArray {

    /**
     * Arrays.stream(array)
     * 
     * count() is a "terminal operation" 
     *  This means that you cannot perform any more operations on the stream.
     */
    public static void streamFromArray1(){
        Double[] numbers = {1.2, 2.2, 3.2};
        Stream<Double> stream = Arrays.stream(numbers);
        
        long n = stream.count();
        System.out.println("Number of elements: "+n);
        System.out.println("============================================");
    }

    /**
     * Stream.of(array)
     */
    public static void streamFromArray2(){
        Integer[] numbers = {1,2,3,4,5};
        Stream<Integer> stream = Stream.of(numbers);
        
        long n = stream.count();
        System.out.println("Number of elements: "+n);
        System.out.println("============================================");
    }


    /**
     * Stream.of(array)
     */
    public static void streamFromArray3(){
        Stream<String> stream1 = Stream.of("A","B","C","D");
        Stream<Integer> stream2 = Stream.of(1,2);
        long n1 = stream1.count();
        long n2 = stream2.count();
        
        System.out.println("Number of elements: "+n1);
        System.out.println("Number of elements: "+n2);
        System.out.println("============================================");
    }
    
    
    public static void main(String[] args) {
        streamFromArray1();
        streamFromArray2();
        streamFromArray3();
    }
    
}
