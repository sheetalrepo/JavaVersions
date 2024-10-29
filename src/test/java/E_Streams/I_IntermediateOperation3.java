package E_Streams;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *  distinct(),skip()
 * 
 *  @author Sheetal Singh
 */
public class I_IntermediateOperation3 {


    /**
     * To remove duplicates
     *      - distinct()                    - Intermediate Operations
     *      - collect(Collectors.toSet())   - Terminal Operations
     */
    public static void testDistinct() {
        //Unique values using distinct - Intermediate Operation        
        List<String> list = Stream.of("Apple", "Mango", "Apple", "Apple", "Oranges")
                .distinct()  // Unique Values Only
                .collect(Collectors.toList());
        System.out.println(list);


        //Unique values using Set - Terminal Operation
        Set<String> mySet1  = Stream.of("Apple1", "Mango1", "Oranges1", "Apple1")
                .collect(Collectors.toSet());
        System.out.println(mySet1);
        System.out.println("============================================");
    }


    /**
     * Skip(count)
     *  - used to skip initial elements
     * 
     */
    public static void testSkip() {
        List<String> list = Stream.of("-1","0", "1", "2", "3", "4", "5")
                .skip(2)  
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("============================================");
    }
    
    
    public static void main(String[] args) {
        testDistinct();
        testSkip();
    }
}
