package D_MethodRef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 *  Method Reference:
 *     Static Type (Unbound Type)
 * 
 * 
 * @author Sheetal Singh
 */
public class D_MethodRefStatic {

    /**
     * interface Consumer<T>
     *     void accept(T t);
     */
    public static void staticMethodReferences(){
        //void accept(T t) = void accept(List<Integer>)
        //lambda
        Consumer<List<Integer>> obj1Lambda  = list -> Collections.sort(list);   //ClassName.method()
        List<Integer> list1 = Arrays.asList(20,10,50,40,108);
        System.out.println("Original List1: "+list1);
        obj1Lambda.accept(list1);// execution
        System.out.println(list1);
        System.out.println("============================================");
        
        //Method Ref
        Consumer<List<Integer>> obj2MR = Collections::sort;
        List<Integer> list2 = Arrays.asList(80,108,3,30,7);
        System.out.println("Original List 2: "+list2);
        obj2MR.accept(list2);// execution
        System.out.println(list2);
        System.out.println("============================================");
    }

    
    public static void main(String[] args) {
        staticMethodReferences();
    }
}
