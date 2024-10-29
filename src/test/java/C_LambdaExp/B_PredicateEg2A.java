package C_LambdaExp;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter a list w/o predicate
 * Pre Java 8
 * 
 * @author Sheetal Singh
 */
public class B_PredicateEg2A {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        List<Integer> listNew = new ArrayList<>();

        for(int n: list){
            if(n > 10){
                listNew.add(n);
            }
        }

        System.out.println(list);
        System.out.println(listNew);
    }
}
