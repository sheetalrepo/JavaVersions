package E_Streams;

import java.util.Set;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toUnmodifiableSet;

/**
 *  Collect Different Features
 *   -Collectors.toSet()
 *   -toSet()
 *   -toUnmodifiableSet()
 *
 * @author Sheetal Singh
 */
public class H_Collect2_toSet {

    /**
     * Stream to Set
     *
     * Collectors.toSet()
     */
    public static void toSet1(){
        //Standard Way
        Set<String> mySet1  = Stream.of("Apple1", "Mango1", "Oranges1", "Apple1")
                .collect(Collectors.toSet());
        System.out.println(mySet1);

        //W/o using Collector
        Set<String> mySet2 = Stream.of("Apple2", "Mango2", "Oranges2", "Apple2")
                .collect(toSet());
        mySet2.add("Banana");
        System.out.println(mySet2);
        System.out.println("============================================");
    }

    /**
     * toUnmodifiableSet()
     *  - Set cannot be modified once created
     */
    public static void toSet2(){
        Set<String> mySet = Stream.of(Locale.getISOCountries())
                .collect(toUnmodifiableSet());
        System.out.println(mySet);

        //mySet.add("XYZ");  // UnsupportedOperationException
        System.out.println("============================================");
    }


    public static void main(String[] args) {
        toSet1();
        //toSet2();
    }
}
