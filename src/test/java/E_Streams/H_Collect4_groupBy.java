package E_Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Collect Different Features
 *   -groupingBy(key)
 *   
 *  To group all the entries present in Stream
 *  values will be List of all entries which cannot be modified later
 *  
 * @author Sheetal Singh
 */
public class H_Collect4_groupBy {

    /**
     * Collectors.groupingBy(key)
     *  - List may have duplicates
     * 
     * Output Map (key, List)
     */
    public static void groupBy1(){
        Stream<String> names = Stream.of("Alex", "John", "Bob", "Jack", "Berlin", "Roger", "Bob", "Berlin");
        Map<Integer, List<String>> map =
                names.collect(Collectors.groupingBy(x -> x.length())); //length treated as key
        System.out.println(map);
        System.out.println("============================================");
    }


    /**
     * Collectors.groupingBy(key, toSet)
     *  -Overloaded method to remove duplicates
     *
     * Output Map (key, Set)
     * 
     */
    public static void groupBy2(){
        Stream<String> names = Stream.of("Alex", "John", "Bob", "Jack", "Berlin", "Roger", "Bob", "Berlin");
        Map<Integer, Set<String>> map =
                names.collect
                        (Collectors.groupingBy(x -> x.length()
                                ,Collectors.toSet()) 
                        ); 
        
        System.out.println(map);
        System.out.println("============================================");
    }
   
    public static void main(String[] args) {
        groupBy1();
        groupBy2();
    }
}
