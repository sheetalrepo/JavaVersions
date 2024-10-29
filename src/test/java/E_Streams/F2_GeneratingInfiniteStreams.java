package E_Streams;

import java.util.List;
import java.util.Random;
import java.util.stream.*;

/**
 * 
 * Two-way to Generate Infinite Streams
 *   1. Stream.generate(Supplier)
 *      - This is suitable for generating constant streams, streams of random elements etc.
 *      - Returns an infinite sequential "UN-Ordered" Streams
 *      
 *  2. Stream.iterate(UnaryOperator)
 *      - Returns an infinite sequential "Ordered" Stream 
 * 
 * @author Sheetal Singh
 */
public class F2_GeneratingInfiniteStreams {

    /**
     * Stream.generate(Supplier)
     *      
     */
    public static void generateStream1() {
        Random r = new Random();
        List<Integer> list = Stream.generate(() -> r.nextInt())
                .filter(n -> n > 0 && n < 1000) // filter for positive numbers
                .filter(n -> n % 2 == 0) // filter for even
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);


        List<Integer> listNew = Stream.generate(new Random()::nextInt)
                .filter(x -> x > 100000)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(listNew);
        
        System.out.println("============================================");
    }

    
    /**
     * Stream.generate(random)
     */
    public static void generateStream2() {
        Stream<Double> randoms = Stream.generate(() -> Math.random());
        List<Double> list = randoms
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println("============================================");
    }

    
    
    /**
     * Stream.iterate(startingPoint, nextNumber)
     *      
     */
    public static void iterateStream1() {

        //collect(list)
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2);   // Starting with 1, print odd numbers
        List<Integer> list = oddNumbers
                .limit(11)         //mandatory else insufficient memory error
                .collect(Collectors.toList());
        System.out.println(list);


        //forEach(print)
        Stream.iterate(5, n -> n+5)
                .limit(5)
                .forEach(System.out::println);
        
        
        System.out.println("============================================");
    }

    /**
     * Stream.iterate(startingPoint, condition, nextNumber)
     */
    public static void iterateStream2() {
        Stream<Integer> oddNumbersJava9 = Stream.iterate(0,       
                n -> n < 41,// Predicate to say when done
                n -> n+2);  
        
        List<Integer> list = oddNumbersJava9
                //.limit(4)  //Not required as condition already provided above
                .collect(Collectors.toList());
        System.out.println(list);
        
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        //generateStream1();
        //generateStream2();
        
        //iterateStream1();
        iterateStream2();
    }

}
