package E_Streams;

import java.util.stream.Stream;

/**
 * Reduction:
 *  - Special type of "Terminal Operation" where "ALL" of the contents of the stream
 *         are combined into a single object
 *  - Reduction always return something
 *  - Reduction Terminal Operation = ALL Element + Return something
 * 
 *  Reduction Terminal Examples:
 *  1. count()
 *  2. min(), max()
 *  3. reduce()
 *  4. collect()
 *  
 *  
 *  Collect()
 *  
 *  
 * @author Sheetal Singh
 */
public class G_TerminalReductionOperations3Collect {

    /**
     * Used in Parallel Streams
     * 
     * Code:
     * collect("supplier", "accumulator", "combiner")     
     *      1. supplier: to initialize e.g. new StringBuilder()
     *      2. accumulator: Adds an element to the collection e.g. the next String to the StringBuilder.
     *      3. combiner: Takes two collections and merges them
     */
    public static void terminalOperationCollect(){
        StringBuilder word = Stream.of("its", " going", " a bit", " difficult")
                .collect(() -> new StringBuilder(),         
                        (sb, str) -> sb.append(str),      
                        (sb1, sb2) -> sb1.append(sb2));   
        System.out.println(word);
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        terminalOperationCollect();
    }
}
