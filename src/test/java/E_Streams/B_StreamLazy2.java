package E_Streams;


import java.util.Arrays;
import java.util.List;

/**
 * 
 *  @author Sheetal Singh
 */
public class B_StreamLazy2 {

    /**
     *  limit(COUNT):
     *      - Will process values till Count reached
     *  
     */
    public static void lazyStream(){
        List<String> listOriginal = Arrays.asList("Alpha","Beta","Aeroplane","Gamma","Aerodynamics", "Aerodynamics123");

        listOriginal
            .stream()                               //Source: create stream 
             .filter(x -> {                         //Intermediate Operation
                System.out.println("Inside Filter 1: "+ x);
                return x.startsWith("A");
             })
             .filter(x -> {                         //Intermediate Operation
                System.out.println("Inside Filter 2: "+ x);
                return x.length() > 6;
             })
             .limit(2)                      //Intermediate Operation, try with 2 
             .forEach(System.out::println);        //Terminal Operation: Stop the stream in case limit reached  
    }
    
    public static void main(String[] args) {
        lazyStream();
    }
    
}
