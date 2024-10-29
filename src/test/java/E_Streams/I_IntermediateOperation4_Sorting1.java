package E_Streams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Sorted()
 *  - Natural Sorting
 * 
 *  @author Sheetal Singh
 */
public class I_IntermediateOperation4_Sorting1 {

    public static void sortedStream(){
        List<String> list = Stream.of("Zebra", "Apes", "Elephant", "Beatle", "Yak")
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("============================================");
    }


    public static void sortedStreamWithFilters(){
        List<String> list = Stream.of("Zebra", "Apes", "Elephant", "Ant", "Aaa")
                .filter(x -> x.startsWith("A"))
                .sorted()    // list sorted here
                .limit(2)  // first two will be considered
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("============================================");
    }
    


    public static void main(String[] args) {
        sortedStream();
        sortedStreamWithFilters();
        
    }
}
