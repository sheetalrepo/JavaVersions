package E_Streams;


import java.util.Arrays;

/**
 * Sequential Stream vs Parallel Stream();
 * 
 * @author Sheetal Singh
 */
public class L_ParallelStreams3 {

    
    public static void sequentialStream() {
        Arrays.asList("p", "r", "o", "d", "-", "b", "u", "g") 
                .stream()  
                .forEach(x -> System.out.print(x));
        
        System.out.println("");
        System.out.println("============================================");
    }
    public static void parallelStream() {
        Arrays.asList("p", "r", "o", "d", "-", "b", "u", "g")
                .stream()
                .parallel()
                .forEach(x -> System.out.print(x));
        
        System.out.println("");
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        sequentialStream();
        parallelStream();
    }
}
