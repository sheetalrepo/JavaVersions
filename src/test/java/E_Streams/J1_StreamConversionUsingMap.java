package E_Streams;

import java.util.stream.*;

/**
 * 
 *  Stream Types:
 *  1. Object Stream
 *          - Stream<Object> e.g. Integer, Double, Long, String 
 *  2. Primitive Stream
 *          - IntStream, DoubleStream, LongStream
 *          
 *  
 *  We can convert different types of Streams among them-self
 *  Refer: Diagram
 *  
 *  Three types of Method
 *  1. map(): 
 *          - In case input and output stream are exactly same for both Primitive & Obj
 *          - Yellow part in diagram
 *  2. mapToObj(): 
 *          - Primitive to Obj
 *          - Orange part
 *  2. mapToX(): 
 *          - Primitive to Primitive
 *          - Obj to Primitive
 *  
 *          
 * @author Sheetal Singh
 */
public class J1_StreamConversionUsingMap {


    /**
     *  Primitive to Primitive
     *      IntStream to IntStream
     *      method: map()   *Imp
     *             if input and output stream are exactly same then method will be map()
     *             otherwise mapToX()
     */
    public static void mapIntStreamToIntStream() {
        IntStream intStream1 = IntStream.of(1, 2, 3);
        IntStream intStream2 = intStream1
                .map(x -> x * 2);
        intStream2.forEach(System.out::println);
        
        System.out.println("============================================");
    }

    /**
     * Same as above
     */
    public static void mapDoubleStreamToDoubleStream() {
        DoubleStream doubleStream1 = DoubleStream.of(10.0, 20.0, 30.0);
        DoubleStream doubleStream2 = doubleStream1
                .map(x -> x * 2);
        doubleStream2.forEach(System.out::println);
        System.out.println("============================================");
    }



    /**
     *  Object to Object
     *      Stream<String> to Stream<String> 
     *      method: map()   *Imp
     *             if input and output stream are exactly same then method will be map()
     *             otherwise mapToX()
     */
    public static void mapObjStreamToObjStream() {
        Stream<String> strStream1 = Stream.of("Prod", "Bug", "Lambda & Streams");
        Stream<String> strStream2 = strStream1
                .map(x -> x.toUpperCase());
        strStream2.forEach(System.out::println);

        System.out.println("============================================");
    }
    
   
    public static void main(String[] args) {
        mapIntStreamToIntStream();
        mapDoubleStreamToDoubleStream();
        mapObjStreamToObjStream();
    }
}
