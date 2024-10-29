package E_Streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Reductions:
 *  - Special type of "Terminal Operation" where "ALL" of the contents of the stream
 *         are combined into a single object
 *  - Reduction always return something
 *  - Reduction Terminal Operation = ALL Element + Return something
 *  - Examples:
 *      1. count()
 *      2. min(), max()
 *      3. reduce()
 *      4. collect()
 *  
 *  
 * @author Sheetal Singh
 */
public class G_TerminalReductionOperations1CountMinMax {

    
    public static void terminalOperationCount(){
        long count = Stream.of("apple", "mango", "oranges")
                        //.filter()  No Intermediate Operations
                        .count();    //Terminal Operations
        System.out.println("Terminal Operation Count: "+ count);
        System.out.println("============================================");
    }


    /**
     * Optional: 
     *      Introduce in Java 8 to replace 'null'. If the stream is
     *      empty then the Optional will be empty (and we won't have to deal with null)
     * 
     * 
     * Optional<T> min(Comparator)
     * Optional<T> max(Comparator)
     */
    public static void terminalOperationMinMax(){
        Optional<String> min = Stream.of("apple", "pie", "oranges", "cat")
                .min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println);

        Optional<Integer> max = Stream.of(40,60,30,90,50, 90)
                .max((i1, i2) -> i1-i2);
        max.ifPresent(System.out::println);
        System.out.println("============================================");
    }


  
    public static void main(String[] args) {
        terminalOperationCount();
        terminalOperationMinMax();
    }
}
