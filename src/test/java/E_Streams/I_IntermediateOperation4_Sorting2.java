package E_Streams;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Custom Sorting
 *  - Sorted(Comparator)
 * 
 *  @author Sheetal Singh
 */
public class I_IntermediateOperation4_Sorting2 {

    public static void sortedPersonClass(){
        //Create Objects
        PersonClass obj1 = new PersonClass("John", 30);
        PersonClass obj2 = new PersonClass("Alpha", 40);
        
        //By Age
        List<PersonClass> sortPersonAge = Stream.of(obj1, obj2)
                .sorted(Comparator.comparing(p -> p.getAge()))
                .collect(Collectors.toList());
        System.out.println("By Age: "+sortPersonAge);
        

        //by Name
        List<PersonClass> sortPersonName = Stream.of(obj1, obj2)
                .sorted(Comparator.comparing(p -> p.getName()))
                .collect(Collectors.toList());
        System.out.println("By Name: "+sortPersonName);
        
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        sortedPersonClass();
    }
}
