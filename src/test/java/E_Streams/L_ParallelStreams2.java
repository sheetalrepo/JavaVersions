package E_Streams;


import java.util.List;
import java.util.stream.Stream;

/**
 * parallel() 
 * 
 * @author Sheetal Singh
 */
public class L_ParallelStreams2 {

    public static void basicStream(){
        int sum = Stream.of(10, 20, 30, 40, 50, 60)
                .mapToInt(x -> x.intValue())
                .sum();

        System.out.println("Sum == "+sum); // 210
        System.out.println("============================================");
    }

    /**
     * Thread 1: 10, 20, 30 = 60
     * Thread 2: 40, 50, 60 = 150
     * Sum = 210
     * 
     */
    public static void basicParallelStream(){
        int sum = Stream.of(10, 20, 30, 40, 50, 60)
                .parallel() 
                .mapToInt(x -> x.intValue())
                .sum();
        
        System.out.println("Sum == "+sum); // 210
        System.out.println("============================================");
    }
 
    public static void main(String[] args) {
        basicStream();
        basicParallelStream();
    }
    
}
