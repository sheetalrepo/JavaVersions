package E_Streams;


import java.util.Arrays;
import java.util.List;

/**
 * #Lazy Concepts
 *  - Return only that much which is required for the time being
 *  - e.g. While scrolling Facebook, only a part of long page is getting loaded
 * 
 * Stream are Lazy
 *  - Stream passes list values one by one vertically downwards
 *  - So value at index 0 will be passed to "Intermediate Operations" and then to "Terminal Operations"
 *    once one cycle is complete then source will pass next value present at index 1
 *  - Just like forEach loop but exists processing of further values in case of some conditions present in Terminal Operations  
 * 
 * 
 *  @author Sheetal Singh
 */
public class B_StreamLazy1 {

    /**
     * Adv of Lazy concepts:
     * Stream has not worked at all on rest of the values present in source
     * As soon as AnyMatch found it will stop working and saved huge memory and processing power 
     */
    public static void lazyStream(){
        List<String> listOriginal = Arrays.asList("alpha","ceta","gamma","delta","bravo");

        listOriginal
                        .stream()                       //Source: create stream 
                        .map(x -> {                     //Intermediate Operations: map will transform(modify) existing stream
                            System.out.println("Inside Map: "+ x);
                            return x.toUpperCase();
                                    
                        })          
                        .anyMatch(x -> {                //Terminal: Stream will stop as soon as anyMatch() return TRUE    
                            System.out.println("Inside AnyMatch: "+ x);
                            return x.startsWith("B");
                        });                
    }
    
    
    
    public static void main(String[] args) {
        lazyStream();
    }
    
}
