package E_Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collect Different Features
 *  - joining
 *  - averagingInt
 *  
 * @author Sheetal Singh
 */
public class H_Collect6_Avg {

    /**
     * collect(Collectors.joining("keyword"))
     */
    public static void joiningStreamKeywords(){
        String joinedNames = Stream.of("Car", "Bike", "Bus")
                .collect(Collectors.joining(" > "));
        System.out.println(joinedNames);
        System.out.println("============================================");
    }


    /**
     * collect(Collectors.averagingInt(lambda exp))
     */
    public static void calculateAverageWithinStream(){
        //Average of all numbers
        Double intStream = Stream.of(10, 20, 30)
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(intStream);

        //Average length of Strings in Streams
        Double avgLength = Stream.of("Car", "Bike", "Buses")   // (3+4+5) / 3
                .collect(Collectors.averagingInt(x -> x.length()));
        System.out.println(avgLength);
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        joiningStreamKeywords();
        calculateAverageWithinStream();
    }
}
