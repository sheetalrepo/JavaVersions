package E_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * How to make Stream of Primitives
 *      - Arrays.stream(array)
 *      - IntStream.of(array)
 *
 * How to make Stream of Objects
 *      - Arrays.stream(array)
 *      - Stream.of(array)
 *      - list.stream()
 *      
 *      
 * Primitive vs Objects Stream (Wrapper Classes)
 *      - IntStream vs Stream<Integer>
 *      - DoubleStream vs Stream<Double>  
 *      - LongStream vs Stream<Long>     
 *      
 *      
 * @author Sheetal Singh
 */
public class E_CreatingStreamsPrimitiveObjTogether {

    public static void primitiveStream1() {
        int[] arrInt = {1, 2, 3, 4};
        IntStream iStream = Arrays.stream(arrInt);
        long n1 = iStream.count();
        System.out.println("int stream: " + n1);
        System.out.println("============================================");
    }

    public static void primitiveStream2() {
        int[] arrInt = {1, 2, 3, 4, 5};
        IntStream iStream = IntStream.of(arrInt);
        long n1 = iStream.count();
        System.out.println("int stream: " + n1);
        System.out.println("============================================");
    }

    public static void objectStream1() {
        Integer[] arrInteger = {1, 2, 3, 4};
        Stream<Integer> stream = Arrays.stream(arrInteger); 
        long n2 = stream.count();
        System.out.println("Integer Stream: " + n2);
        System.out.println("============================================");
    }

    public static void objectStream2() {
        Integer[] arrInteger = {10, 20, 30, 40, 50};
        Stream<Integer> stream = Stream.of(arrInteger);  
        long n2 = stream.count();
        System.out.println("Integer Stream: " + n2);
        System.out.println("============================================");
    }


    public static void objectStream3() {
        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> streamInteger = listInteger.stream();
        long n = streamInteger.count();
        System.out.println("Integer Stream: " + n);
        System.out.println("============================================");
    }
  
    public static void main(String[] args) {
        primitiveStream1();
        primitiveStream2();
        objectStream1();
        objectStream2();
        objectStream3();
    }

}
