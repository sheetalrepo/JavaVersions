package E_Streams;

import java.util.stream.Stream;

/**
 * Terminal operations:
 *      - Can be performed without any Intermediate operations
 *      - Refer A_StreamBasics.java
 * 
 * Reductions:
 *  - Special type of "Terminal Operation" where "ALL" of the contents of the stream
 *         are combined into a single object
 *  - Reduction always return something
 *  - Reduction Terminal Operation = ALL Element + Return something
 * 
 *  Reduction Terminal Examples:
 *  1. count()
 *  2. min(), max()
 *  3. reduce()
 *  4. collect()
 *  
 *  
 *  Other Non Reduction Terminal Examples:
 *  1. findAny()   : May not look at all the elements
 *  2. findFirst()  : May not look at all the elements
 *  3. allMatch(), anyMatch(), noneMatch() : May not look at all the elements
 *  4. forEach() : Will look at all element BUT will NOT return any value
 * 
 * 
 * @author Sheetal Singh
 */
public class G_TerminalReductionOperations2Reduce {


    /**
     * 
     * Reduce without "Identity" i.e "Initial Values"
     *
     * Type 1:
     * reduce("accumulator")      
     */
    public static void terminalOperationReduce1(){

        //Empty No Result
        Stream<Integer> empty = Stream.empty();
                empty
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        //One Element
        Stream<Integer> oneElement = Stream.of(10);
        oneElement
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        //Multiple Element
        Stream<Integer> multipleElements = Stream.of(10, 20, 30);
        multipleElements
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        System.out.println("============================================");
    }
    
    

    /**
     * 
     * 
     * Reduce
     *      - Process all the element present in Stream
     *      - Return value and hence Reduction 
     *      - The most common way of doing a reduction is to start with
     *              an initial value and keep merging it with the next value
     *      - reduce("initial values", "accumulator") 
     *              - It cannot be empty as "Initial value" will always be returned hence no Optional
     *              - accumulator: for further operations
     *                      BinaryOperator  T apply(T, T)
     *   
     *  Type 2: 
     *  reduce("initial values", "accumulator")     
     *  "Initial values" can also be called "Identity"
     */
    public static void terminalOperationReduce2(){
        String name = Stream.of("J", "a", "v", "a")
                .reduce("Hello ", (x, y) -> x + y);
        System.out.println(name);
        
        
        
        String name2 = Stream.of("Alp", "Bravo", "Cat", "Tiger")
                .filter(x -> x.length() > 3)
                .reduce("Hello ", (x, y) -> x + y);
        System.out.println(name2);
        

        Integer product = Stream.of(2, 3, 4)
                .reduce(1, (x, y) -> x * y);
        System.out.println(product);  // 1 * 2 * 3 * 4
        System.out.println("============================================");
    }


    

    /**
     * Only used in Parallel Streams
     *  - Internally multiple thread will pick different stream values and apply accumulator on them
     *  - We combine result of all the threads at last
     *  - faster operation, less time (adv)
     *  - more processing power (dis-adv)
     * 
     * Type 2: 
     * reduce("initial values", "accumulator", "combiner")     
     */
    public static void terminalOperationReduce3(){
        Stream<String> stream = Stream.of("Apple", "Oranges", "Car", "Bus");  // 5 + 7 , 3 + 3 = 12+6 = 18 
        int length = stream.reduce( 0,  //Initial Value
                (x, str) -> x + str.length(),  // Thread 1: 5 + 7 , Thread 2: 3 + 3 
                (r1, r2) -> r1 + r2);   //12 + 6
        System.out.println(length);
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        //terminalOperationReduce1();
        //terminalOperationReduce2();
        terminalOperationReduce3();
    }
}
