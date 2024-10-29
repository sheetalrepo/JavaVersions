package E_Streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Collect Different Features
 *   -toMap(key, value)
 *   -toMap(key, value, merge_function)
 *  
 * @author Sheetal Singh
 */
public class H_Collect3_toMap {

    /**
     * toMap
     * 
     * Collectors.toMap(key, value)
     */
    public static void toMap1(){
        Map<String, Integer> map = Stream.of("India", "Spain", "France")
                        .collect(Collectors.toMap(x -> x, x -> x.length()));
        System.out.println(map);
        System.out.println("============================================");
    }

    /**
     * Collectors.toMap(key, value, merge_function)
     * merge_function : incase key is same
     * 
     * 
     * Business Case:
     * I want to map all countries based on their length
     * So that same length country should come together
     */
    public static void toMap2(){
        //Collectors.toMap(length, country)
        //IllegalStateException: Duplicate key 5
//        Map<Integer, String> map1 =  Stream.of("India", "Spain", "France")
//                        .collect(Collectors.toMap(x -> x.length() ,x -> x));
//        System.out.println(map1);
       
        //Collectors.toMap(length, country, merge_function)     
        Map<Integer, String> map2 =  Stream.of("India", "Spain", "France")
                .collect(Collectors.toMap(x -> x.length() ,x -> x,
                                                (x1, x2) -> x1 + "," + x2) );
        System.out.println(map2);
        System.out.println("============================================");
    }
   
    public static void main(String[] args) {
        toMap1();
        toMap2();
    }
}
