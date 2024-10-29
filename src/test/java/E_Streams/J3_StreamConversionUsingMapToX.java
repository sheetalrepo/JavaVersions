package E_Streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 *  Stream Types:
 *  1. Object Stream
 *          - Stream<Object> e.g. Integer, Double, Long, String 
 *  2. Primitive Stream
 *          - IntStream, DoubleStream, LongStream
 *          
 * @author Sheetal Singh
 */
public class J3_StreamConversionUsingMapToX {


    /**
     *  Primitive to Primitive
     *      IntStream to DoubleStream
     *      method: mapToDouble()   *Imp
     */
    public static void mapIntStreamToDoubleStream() {
        IntStream intStream = IntStream.of(10, 20, 30);
        DoubleStream doubleStream = intStream
                .mapToDouble(x -> (double)x/2);
        doubleStream.forEach(System.out::println);
        System.out.println("============================================");
    }


    /**
     *  Object to Primitive
     *      StringStream to IntStream
     *      method: mapToInt()   *Imp
     */
    public static void mapStringStreamToIntStream() {
        Stream<String> stringStream = Stream.of("Prod", "Bug", "Lambda & Streams");
        IntStream intStream = stringStream
                .mapToInt(x -> x.length());
        intStream.forEach(System.out::println);
        System.out.println("============================================");
    }


    public static void main(String[] args) {
        mapIntStreamToDoubleStream();
        mapStringStreamToIntStream();
    }

}
