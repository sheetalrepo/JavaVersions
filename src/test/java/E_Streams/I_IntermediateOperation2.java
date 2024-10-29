package E_Streams;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *  map(), flatMap()
 *  
 *  @author Sheetal Singh
 */
public class I_IntermediateOperation2 {

  
    /**
     * Map()
     *  - To transform the data
     *  - Modify current stream into another stream
     */
    public static void mapStream() {
        List<Integer> list = Stream.of(10, 20, 30, 40, 50)
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println("============================================");
    }

    /**
     * FlatMap
     *      - To combine multiple small list into one stream
     * 
     */
    public static void flatMapStream1() {
        List<String> list1 = Arrays.asList("P", "R", "O");
        List<String> list2 = Arrays.asList("D", "-");
        List<String> list3 = Arrays.asList("B", "U", "G");
        Stream<List<String>> streamOfLists = Stream.of(list1, list2, list3);

        List<String> listFinal = streamOfLists.flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(listFinal);
 
        System.out.println("============================================");
    }


    public static void flatMapStream2() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9, 10)
        );

        int sum = listOfLists.stream()
                .flatMap(x -> x.stream())
                .mapToInt(x -> x.intValue())
                .sum();

        System.out.println(sum);
        System.out.println("============================================");
    }

    public static void main(String[] args) {
       
        //mapStream();
        flatMapStream1();
        flatMapStream2();
    }
}
