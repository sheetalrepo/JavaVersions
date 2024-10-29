package E_Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Collect Different Features
 *      -partitioningBy(key)
 *      
 *  PartitioningBy    
 *      - Sub-type of "groupBy"
 *      - Only two group possible True or False
 *      
 *      
 * @author Sheetal Singh
 */
public class H_Collect5_partitioningBy {

    /**
     *  Collectors.partitioningBy(condition, downstream)
     *      -downstream : List (may have duplicates)
     */
    public static void partitioningBy1(){
        Stream<String> names1 = Stream.of("Alex", "Bob", "Berlin", "Roger", "Bob");
        Map<Boolean, List<String>> map1 =
                names1.collect(
                        Collectors.partitioningBy(
                                s -> s.length() > 4,
                                Collectors.toList())
                );
        System.out.println(map1);

        Stream<String> names2 = Stream.of("Alex", "Bob", "Berlin", "Roger", "Bob");
        Map<Boolean, List<String>> map2 =
                names2.collect(
                        Collectors.partitioningBy(
                                s -> s.startsWith("A"),
                                Collectors.toList())
                );  
        System.out.println(map2);
        
        System.out.println("============================================");
    }

    /**
     *  Collectors.partitioningBy(condition, downstream)
     *      -downstream : Set (to remove duplicates)
     */
    public static void partitioningBy2(){
        Stream<String> names = Stream.of("Alex", "Bob", "Berlin", "Roger", "Bob");
        Map<Boolean, Set<String>> map =
                names.collect(
                        Collectors.partitioningBy(
                                s -> s.length() > 4,
                                Collectors.toSet())
                );
        System.out.println(map);
        System.out.println("============================================");
    }



   
    public static void main(String[] args) {
        partitioningBy1();
        partitioningBy2();
    }
}
