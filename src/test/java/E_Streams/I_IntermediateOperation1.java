package E_Streams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Stream Pipeline
 *  - Its consists of three parts
 *      a. Source: 
 *              - Where the stream comes from e.g. array, collection or file etc
 *      b. Intermediate Operations: 
 *              - Transforms/Filter the stream into another one. There can be one or more operations.
 *              - Produces a new stream based on conditions
 *      c. Terminal Operations: 
 *              - It produces the final results
 *              - Once terminal operation executes, stream cannot be reused
 *              - Pipeline finished here 
 *
 *      
 *  Intermediate Operations: create a new streams based on conditions
 *      1. filter(), limit(), peek()
 *      2. map(), flatMap()
 *      3. distinct(),skip()
 *      4. sorted()
 *  
 *
 *  @author Sheetal Singh
 */
public class I_IntermediateOperation1 {

    /**
     * Filter()
     */
    public static void filterStream(){
        List<String> list = Stream.of("Apple", "Mango", "Oranges")
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("============================================");
    }

    /**
     * Limit() & Peak()
     * Lazy Evaluation:
     *      - As soon as limit() reached rest of the element in Stream will not be evaluated
     *      - In this case 80, 90, 100 will not be read by Stream
     *
     * Peak()
     * Its simply to print currently used element in stream for debugging purposes
     * 
     * 
     * @author Sheetal Singh
     */
    public static void limitStream() {
        //Unique values using distinct - Intermediate Operation        
        List<Integer> list = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
                .peek(n -> System.out.println(" A - " + n))   //For Debugging
                .filter(n -> n > 50)
                .peek(n -> System.out.println(" B - " + n))   //For Debugging
                .limit(2)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println(">>>"+ list);
        System.out.println("============================================");
    }


    
    public static void main(String[] args) {
        filterStream();
        limitStream();
       
    }
    
}
