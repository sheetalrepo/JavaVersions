package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Unbounded Wildcard ?
 * Read Only
 *
 */
public class C_WildCard {

    /**
     * Accept List<?> List of Anything & print them
     *  - List<?> is read only
     *  - value cannot be added
     */
    public static void accept(List<?> anyList) {
        for (Object o: anyList){
            System.out.println(o);
        }
        
        //anyList.add(10);  // Not Allowed to add
        System.out.println("============================================");
    }
   
    public static void main(String[] args) {
       List<Integer> integerList = new ArrayList<>();
       integerList.add(10);
       integerList.add(20);
       accept(integerList);

       List<String> strList = new ArrayList<>();
       strList.add("abc");
       strList.add("xyz");
       accept(strList);

       List<Number> numberList = new ArrayList<>();
       numberList.add(10);
       numberList.add(20);
       accept(numberList);
    }
}
