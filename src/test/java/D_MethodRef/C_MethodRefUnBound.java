package D_MethodRef;


import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *  Method Reference:
 *      Un Bound Type 
 * 
 * 
 * @author Sheetal Singh
 */
public class C_MethodRefUnBound {

    /**
     * Interface Function<T, R> 
     *       R apply(T)   
     *       
     *       R & T = String in example
     */
    public static void unBoundMethodReferences1(){
        //String str = "We Are Learning JAVA Method Reference";    Will be passed str later
        
        Function<String, String> obj1Lambda  = s -> s.toLowerCase();
        Function<String, String> obj2MR = String::toLowerCase;
        
        // The Function is UNBOUND, so we need to specify which instance to call it on
        System.out.println(obj1Lambda.apply("We Are Learning JAVA Method Reference"));    //Str to be passed here
        System.out.println(obj2MR.apply("We Are Learning JAVA Method Reference"));
        System.out.println("============================================");
    }


    /**
     * interface BiFunction<T, U, R>
     *       R apply(T t, U u);
     *
     *       R, T, U = String in example
     */
    public static void unBoundMethodReferences2(){
        BiFunction<String, String, String> obj1Lambda   = (x, y) -> x.concat(y);
        BiFunction<String, String, String> obj2MR  = String::concat;

        //Unbound case, need to specify String
        System.out.println(obj1Lambda.apply("Java ", "Lambda"));
        System.out.println(obj2MR.apply("Java ", "Method Reference"));
        System.out.println("============================================");
    }
    
    
    public static void main(String[] args) {
        unBoundMethodReferences1();
        unBoundMethodReferences2();
    }
}
