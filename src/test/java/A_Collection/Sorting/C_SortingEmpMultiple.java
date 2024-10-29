package A_Collection.Sorting;

import java.util.*;

/**
 * 
 * @author Sheetal Singh
 */
public class C_SortingEmpMultiple {

    private static List<C_Employee> getListOfEmployees() {
        List<C_Employee> listEmp = new ArrayList<>();
        C_Employee obj1 = new C_Employee("Carla", 2000);
        C_Employee obj2 = new C_Employee("Ana", 3000);
        C_Employee obj3 = new C_Employee("Bella", 1000);
        C_Employee obj4 = new C_Employee("Bella", 5000);
        C_Employee obj5 = new C_Employee("Danny", 3000);
        
        listEmp.add(obj1);
        listEmp.add(obj2);
        listEmp.add(obj3);
        listEmp.add(obj4);
        listEmp.add(obj5);
        
        return listEmp;
    }
    
    
    
    /**
     * To be used in case of duplicate names
     * Priority to be given to names
     */
   public static void sortingByMultipleFields1(){
       List<C_Employee> listEmp = getListOfEmployees();

       Collections.sort(listEmp, Comparator
                                        .comparing(C_Employee::getName)
                                        .thenComparing(C_Employee::getId)                    
        );
       
       System.out.println("Mult Sorting: "+ listEmp);
       System.out.println("============================================");
    }



    /**
     * Priority to be given to Id
     */
    public static void sortingByMultipleFields2() {
        List<C_Employee> listEmp = getListOfEmployees();

        Collections.sort(listEmp, Comparator
                .comparing(C_Employee::getId)
                .thenComparing(C_Employee::getName)
        );

        System.out.println("Mult Sorting: " + listEmp);
        System.out.println("============================================");
    }
  


    public static void main(String[] args) {
        sortingByMultipleFields1();
        sortingByMultipleFields2();
    }
}
