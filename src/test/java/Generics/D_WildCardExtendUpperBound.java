package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Upper Bound Wildcard 
 *    -  ? extend Type
 *    -  Read Only
 * 
 * ? means anything which extend Type T, hence T is max limit
 * thats why called "upper bound" i.e upper limit has been bounded
 * 
 * Integer extends Number
 * Double extends Number
 */
public class D_WildCardExtendUpperBound {

    /**
     * Accept List<? extends Number> 
     *  - List<? extends Number>  is read only
     *  - value cannot be added
     * 
     */
    public static void accept(List<? extends Number> anyNumber) {
        for (Number n: anyNumber){
            System.out.println(n);
        }
        
        //anyList.add(10);  // Not Allowed to add
        System.out.println("============================================");
    }
   
    public static void main(String[] args) {
       List<Integer> integerList = new ArrayList<>();
       integerList.add(10);
       integerList.add(20);
       accept(integerList);

       List<Double> doubleList = new ArrayList<>();
       doubleList.add(10.5);
       doubleList.add(20.6);
       accept(doubleList);
       
       List<Number> numberList = new ArrayList<>();
       numberList.add(10);
       numberList.add(20);
       accept(numberList);
    }
}
