package A_Collection.Sorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set : Interface used for unique values
 * 
 * HashSet : No Ordering
 * LinkedHashSet: Insertion Order   
 * TreeSet: Natural(Default) Or Custom Order (using Comparator)
 *          TreeSet need Sorting 
 * 
 * ClassCastException
 * 
 * https://www.geeksforgeeks.org/difference-and-similarities-between-hashset-linkedhashset-and-treeset-in-java/
 * 
 * @author Sheetal Singh
 */
public class D_TreeSetProblem {

    public static void treeSet(){
        Set<String> ts = new TreeSet<>();
        ts.add("Tiger");
        ts.add("Ant");
        ts.add("Dog");
        ts.add("Kite");
        ts.add("Cat");

        System.out.println(ts);
        
    }
    
    public static void sortDog(){
        Set<D_Dog> obj = new TreeSet<>();
        obj.add(new D_Dog(200));
        obj.add(new D_Dog(100));
        obj.add(new D_Dog(300));

        System.out.println(obj);
    }


    public static void sortCat(){
        Set<D_Cat> obj = new TreeSet<>();
        obj.add(new D_Cat(2000));
        obj.add(new D_Cat(1000));
        obj.add(new D_Cat(3000));
        System.out.println(obj);
    }
    


    public static void sortCatAgain(){
        //Set<D_Cat> obj = new TreeSet<>((x,y) -> x.getId() - y.getId());       //Lambda
        Set<D_Cat> obj = new TreeSet<>(Comparator.comparing(x -> x.getId())); //Comparing
        //Set<D_Cat> obj = new TreeSet<>(Comparator.comparing(D_Cat::getId));     //Method Ref
        obj.add(new D_Cat(2000));
        obj.add(new D_Cat(1000));
        obj.add(new D_Cat(3000));
        System.out.println(obj);
    }
    
    public static void main(String[] args) {
        //treeSet();
        //sortDog();
        //sortCat();
        sortCatAgain();
    }
    
}
