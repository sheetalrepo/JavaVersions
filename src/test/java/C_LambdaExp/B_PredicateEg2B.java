package C_LambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Filter Integer and String using Predicate  
 * 
 * @author Sheetal Singh
 */
public class B_PredicateEg2B {

    /**
     * Standard method to filter any type of list or any given condition (via predicate) 
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> listFiltered = new ArrayList<>();

        for(T item: list){
            if(predicate.test(item)){       // Calling abstract method "test" present in predicate interface with one item
                listFiltered.add(item);
            }
        }
        return listFiltered;
    }

    //Method to filter Integers
    private static void filterInteger() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        Predicate<Integer> predicate = x -> x > 10; // Implementation for number greater than 10
        List<Integer> listNew = filter(list, predicate);

        System.out.println(list);
        System.out.println(listNew);
        System.out.println("============================================");
    }


    //Method to filter String
    private static void filterString() {
        List<String> list = new ArrayList<>();
        list.add("Football");
        list.add("Cricket");
        list.add("Basket Ball");
        
        //Predicate<String> predicate = x -> x.startsWith("F");
        Predicate<String> predicate = x -> x.length() > 7;     //return type boolean
        List<String> listNew = filter(list, predicate);

        System.out.println(list);
        System.out.println(listNew);
        System.out.println("============================================");
    }
      

    public static void main(String[] args) {
        filterInteger();
        filterString();
    }
}
