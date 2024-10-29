package E_Streams;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toUnmodifiableList;

/**
 *  Collect Different Features
 *   -Collectors.toList()
 *   -toList()
 *   -toUnmodifiableList()
 *  
 * @author Sheetal Singh
 */
public class H_Collect1_toList {

    /**
     * Stream to List
     * 
     * Collectors.toList()
     */
    public static void toList1(){
        //Basic Way
        Stream<String> stream = Stream.of("Apple1", "Mango1", "Oranges1");
        List<String> myList1  = stream
                .collect(Collectors.toList());
        System.out.println(myList1);
        
        //Standard Way
        List<String> myList2  = Stream.of("Apple2", "Mango2", "Oranges2")
                    .collect(Collectors.toList());
        System.out.println(myList2);
        
        //W/o using Collector
        List<String> myList3 = Stream.of("Apple3", "Mango3", "Oranges3")
                .collect(toList());
        myList3.add("Banana");
        System.out.println(myList3);
        System.out.println("============================================");
    }

    /**
     * toUnmodifiableList()
     *  - List cannot be modified once created
     */
    public static void toList2(){
        List<String> myList1 = Stream.of(Locale.getISOCountries())
                .collect(toUnmodifiableList());
        System.out.println(myList1);
        
        //myList1.add("XYZ");  // UnsupportedOperationException
        System.out.println("============================================");
    }


    public static void main(String[] args) {
        //toList1();
        toList2();
    }
}
