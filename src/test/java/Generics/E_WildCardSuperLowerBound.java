package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Lower Bound Wildcard 
 *    -  ? super Type
 *    -  Read Write Allowed
 * 
 * ? means anything which is Supper to Type T, hence T is min limit
 * thats why called "lower bound" i.e lower limit has been bounded
 * +
 * sub class can also be added
 * 
 * ? super Integer
 * Integer, Number, Object can be added as they are Higher than Integer
 * 
 * 
 */
public class E_WildCardSuperLowerBound {

    /**
     * Accept List<? super Integer> 
     *  - List<? extends Number>  is read only
     *  - value cannot be added
     * 
     */
    public static void accept(List<? super Integer> superInt) {
        for (Object n: superInt){
            System.out.println(n);
        }

        superInt.add(10);  // Allowed to add
        System.out.println("============================================");
    }
   
    public static void main(String[] args) {
       List<Integer> integerList = new ArrayList<>();
       integerList.add(10);
       integerList.add(20);
       accept(integerList);

       //Double is not Super to Integer
       List<Double> doubleList = new ArrayList<>();
       doubleList.add(10.5);
       doubleList.add(20.6);
       //accept(doubleList);  
       
       List<Number> numberList = new ArrayList<>();
       numberList.add(100);
       numberList.add(200);
       accept(numberList);

        List<Object> objList = new ArrayList<>();
        objList.add("abc");
        objList.add("xyz");
        accept(objList);
    }
}
