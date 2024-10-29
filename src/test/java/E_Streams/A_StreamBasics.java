package E_Streams;


import java.util.Arrays;
import java.util.List;

/**
 * Stream
 *  - Introduced in Java 8
 *  - Makes code more concise
 *  - Data can be filtered on the go
 *  - They dont store any data like Array, List. They simply process existing data.
 *  
 *  
 *  Stream Pipeline
 *  - Its consists of three parts: 
 *      a. Source: Where the stream comes from e.g. array, collection or file etc
 *      b. Intermediate Operations: Transforms/Filter the stream into another one. There can be one or more operations.
 *      c. Terminal Operations: 
 *              - It produces the final results
 *              - Once terminal operation executes, stream cannot be reused
 *              - Pipeline finished here 
 * 
 *  Examples:
 *  Source : List, Arrays
 *
 *  Intermediate Operations (8): create a new streams based on conditions
 *      1. filter(), limit(), peek()
 *      2. map(), flatMap()
 *      3. distinct(),skip()
 *      4. sorted()
 *      
 *  Terminal Operations: (11)
 *     1. Non Reduction: findAny(), findFirst(), allMatch(), anyMatch(), noneMatch(), forEach()
 *     2. Reduction: count(), min(), max(),reduce(), collect()
 * 
 * 
 * Stream
 * 1. Object Stream
 *         - Stream<Object> e.g. Integer, Double, Long, String 
 * 2. Primitive Stream
 *         - IntStream, DoubleStream, LongStream
 *         
 * Refer Diagram: https://basicsstrong.com/java-streams-parallel-and-declarative/
 */
public class A_StreamBasics {

    public static void basicStream(){
        List<Double> listOriginal = Arrays.asList(98.5, 100.4, 102.45, 80.55);

        long count = listOriginal
                        .stream()                       //Source: create stream 
                           // .peek(System.out::println)      //Print every value in source, just for debugging    
                        .filter(x -> x > 10)           //Intermediate Operations
                           // .peek(System.out::println)      //Print only filtered value, just for debugging   
                        .count();                       //Terminal Operations

        System.out.println("Count of Temp > 100 is: "+ count);
    }
    
    public static void main(String[] args) {
        basicStream();
    }
    
}
