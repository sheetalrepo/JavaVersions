package E_Streams;

import java.util.List;
import java.util.stream.*;

/**
 * 
 * Primitive to Object  Conversion
 *      - mapToObj
 * 
 * 
 *  Stream Types:
 *  1. Object Stream
 *          - Stream<Object> e.g. Integer, Double, Long, String 
 *  2. Primitive Stream
 *          - IntStream, DoubleStream, LongStream
 *          
 *          
 * @author Sheetal Singh
 */
public class J2_StreamConversionUsingMapToObj {

    /**
     *  Primitive to Object
     *      IntStream to Stream<String>
     *      method: mapToObject()
     *
     */
    public static void mapIntToObjStream() {
        IntStream intStream = IntStream.of(1, 2, 3);
        Stream<String> strStream = intStream
                .mapToObj(n -> "Number:"+ n);
        
        strStream.forEach(System.out::println);
        
//      List<String> ls = strStream.collect(Collectors.toList());
//      System.out.println(ls);

        System.out.println("============================================");
    }


    /**
     *  Primitive to Object
     *      LongStream to Stream<Long>
     *      method: mapToObject()
     *
     */
    public static void mapLongToObjStream() {
        LongStream intStream = LongStream.of(1L, 2L, 3L);
        Stream<Long> longStream = intStream
                .mapToObj(n -> n * 10000000);

        longStream.forEach(System.out::println);
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        mapIntToObjStream();
        mapLongToObjStream();

    }

}
