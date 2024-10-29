package E_Streams;


import java.util.List;
import java.util.stream.Stream;

/**
 * Parallel Stream
 *  1. parallel()
 *      - available in Stream<> interface
 *  2. parallelStream()
 *      - available in Collection<> interface
 *      
 *      
 * 
 * @author Sheetal Singh
 */
public class L_ParallelStreams1 {

    public static void basicStream(){
        //parallel
        Stream<String> animalsStream1 = Stream.of("Dog", "Cat", "Horse")
                .parallel();
        animalsStream1.forEach(x -> System.out.println(Thread.currentThread().getId() +": "+ x));
        System.out.println("============================================");
        
        
        //parallelStream
        Stream<String> animalsStream2 = List.of("Dog", "Cat", "Horse")
                .parallelStream();
        animalsStream2.forEach(x -> System.out.println(Thread.currentThread().getId() +": "+ x));
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        basicStream();
    }
    
}
