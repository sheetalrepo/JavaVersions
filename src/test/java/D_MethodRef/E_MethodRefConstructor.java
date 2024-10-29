package D_MethodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  Method Reference:
 *      Constructor Type
 * 
 * 
 * @author Sheetal Singh
 */
public class E_MethodRefConstructor {


    /**
     * Supplier<T>
     *     T get();
     */
    public static void constructorMethodReferences1(){
        //Lambda
        Supplier<StringBuilder> obj1Lambda   = () -> new StringBuilder();  //Constructor using "new"
        StringBuilder sb1 = obj1Lambda.get();   //calling Supplier method get()
        sb1.append("Lambda ");
        sb1.append("version");
        System.out.println(sb1);

        //Method Reference
        Supplier<StringBuilder> obj2MR  = StringBuilder::new;  //Constructor using "new"
        StringBuilder sb2 = obj2MR.get();  //calling Supplier method get()
        sb2.append("Method reference ");
        sb2.append("version");
        System.out.println(sb2);
        System.out.println("============================================");
    }

    
    /**
     *  interface Function<T, R>
     *      R apply(T t);
     *      
     *      List<String> apply(Integer)
     */
    public static void constructorMethodReferences2(){
        //Lambda
        Function<Integer, List<String>> obj1Lambda  = x -> new ArrayList(x); //initialCapacity
        List<String> ls1 = obj1Lambda.apply(10);  // size 1O
        ls1.add("21");
        System.out.println(ls1);//[21]
        
        
        //Method Reference
        Function<Integer, List<String>> obj2MR = ArrayList::new;
        List<String> ls2 = obj2MR.apply(5);  // size 5
        ls2.add("88");
        System.out.println(ls2);//[88]
    }


    public static void main(String[] args) {
        //constructorMethodReferences1();
        constructorMethodReferences2();
    }
}
