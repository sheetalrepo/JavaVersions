package E_Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author Sheetal Singh
 */
public class E_CreatingStreamsFromCollections {

    /**
     * Collection.stream()
     * 
     * 
     * stream() is a default method in the Collection interface and therefore 
     *    is inherited by all classes that implement Collection like ArrayList, HashSet etc
     */
    public static void streamFromCollection(){
        List<String> listStr = Arrays.asList("cat", "dog", "fox");
        Stream<String> streamStr = listStr.stream();

        long n = streamStr.count();
        System.out.println("Number of elements: "+n); 
        System.out.println("============================================");
    }

    /**
     * Map is not a Collection. 
     * 
     * To make Map compatible with Collections we use entrySet()
     * 
     * entrySet() : return a Set view of the Map and Set IS A Collection
     */
    public static void streamFromMap(){
        Map<String, Integer> mapFruits = new HashMap<>();
        mapFruits.put("Apple", 10);
        mapFruits.put("Mango", 20);

        long n = mapFruits
                .entrySet() // get a Set view of the Map
                .stream()   // stream() is a default method in Collection  
                .count();
        
        System.out.println("Number of entries: "+ n);
        System.out.println("============================================");
    }


    
    
    public static void main(String[] args) {
        streamFromCollection();
        streamFromMap();
    }
    
}
