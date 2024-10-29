package E_Streams;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Terminal operations:
 *      - Can be performed without any Intermediate operations
 *      - Refer A_StreamBasics.java
 *      - Types:
 *          1. Non Reduction: May/May Not check all element + May/May Not return something
 *          2. Reduction: ALL Element + Return something
 *        
 *        
 * Reductions:
 *  - Special type of "Terminal Operation" where "ALL" of the contents of the stream
 *         are combined into a single object
 *  - Reduction always return something
 *  - Reduction Terminal Operation = ALL Element + Return something
 *  - Examples:
 *      count(), min(), max(),reduce(), collect()
 * 
 *  Non reduction:
 *  - May not look at all elements present in Stream
 *  - may or May not return something
 *  - Examples:
 *      1. findAny()   : May not look at all the elements
 *      2. findFirst()  : May not look at all the elements
 *      3. allMatch(), anyMatch(), noneMatch() : May not look at all the elements
 *      4. forEach() : Will look at all element BUT will NOT return any value
 *
 *
 * @author Sheetal Singh
 */
public class G_TerminalNonReductionOperations {

    /**
     *  
     * findAny(), findFirst():
     *      These are terminal operations but not reductions 
     *      as they sometimes return without processing all 
     *      the elements in the stream. Reductions reduce the 
     *      entire stream into one value.
     *         
     * Optional<T> findAny()
     *      The behavior of this operation is explicitly nondeterministic; 
     *      it is free to select any element in the stream
     * Optional<T> findFirst()
     */
    public static void terminalOperationFindAnyFindFirst(){
        Optional<String> any = Stream.of("B", "A", "M", "Z", "X", "N")
                .findAny();
        any.ifPresent(System.out::println);

        Optional<String> first = Stream.of("4", "2", "1", "5", "7", "8")
                .findFirst();
        first.ifPresent(System.out::println);
        System.out.println("============================================");
    }


    /**
     * Match
     *  It's not Reduction as it may not process all the elements present in the Stream
     * 
     * boolean anyMatch(Predicate)  : Any one match should present
     * boolean allMatch(Predicate)  : All should match else false
     * boolean noneMatch(Predicate) : None should match else false
     */
    public static void terminalOperationMatch(){
        List<String> names = Arrays.asList("Bravo", "Alpha", "Charlie");
        Predicate<String> objPredicate = name -> name.startsWith("A");
        
        System.out.println("anyMatch: "+names.stream().anyMatch(objPredicate)); 
        System.out.println("allMatch: "+names.stream().allMatch(objPredicate));
        System.out.println("noneMatch: "+names.stream().noneMatch(objPredicate));
        System.out.println("============================================");
    }


    /**
     * 
     * void forEach(Consumer)
     *      It's not Reduction as it will not return anything (Although its covering all the element in Stream)
     * 
     * 
     */
    public static void terminalOperationForEach(){
        Stream<String> streamStr1 = Stream.of("Bravo", "Alpha", "Charlie");
        streamStr1.forEach(System.out::print);
        System.out.println();


        List<String> listStr = Arrays.asList("foo", "bar");
        for(String str : listStr){
            System.out.println(str);
        }
        
        /**
         * Compiler Error
         * Streams do not implement the Iterable interface.
         */
        Stream<String> streamStr2 = Stream.of("Bravo", "Alpha", "Charlie");
//        for(String sre : streamStr2){
//            System.out.println(str);  
//        }
        System.out.println("============================================");
    }


    public static void main(String[] args) {
        //terminalOperationFindAnyFindFirst();
        //terminalOperationMatch();
        terminalOperationForEach();
    }
}
