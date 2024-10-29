package A_Collection.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Sheetal Singh
 */
public class A_SortingEmpComparable {

    public static void comparableArrayEg1(){
        A_Employee[] arrEmp = new A_Employee[3];
        
        A_Employee obj1 = new A_Employee("Cathy", 200);
        A_Employee obj2 = new A_Employee("Albert", 300);
        A_Employee obj3 = new A_Employee("Brat", 100);
        
        arrEmp[0] = obj1;
        arrEmp[1] = obj2;
        arrEmp[2] = obj3;
        
        
        Arrays.sort(arrEmp);
        System.out.println(Arrays.toString(arrEmp));
    }


    public static void comparableListEg2(){
        List<A_Employee> listEmp = new ArrayList<>();
        A_Employee obj1 = new A_Employee("Carla", 2000);
        A_Employee obj2 = new A_Employee("Ana", 3000);
        A_Employee obj3 = new A_Employee("Bella", 1000);
        
        listEmp.add(obj1);
        listEmp.add(obj2);
        listEmp.add(obj3);

        Collections.sort(listEmp);
        System.out.println(listEmp);
    }

    
    public static void main(String[] args) {
        //comparableArrayEg1();
        comparableListEg2();
    }
}
