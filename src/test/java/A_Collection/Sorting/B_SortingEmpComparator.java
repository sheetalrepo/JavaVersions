package A_Collection.Sorting;

import java.util.*;

/**
 * 
 * @author Sheetal Singh
 */
public class B_SortingEmpComparator {

    public static void comparatorArrayEg1(){
        B_Employee[] arrEmp = new B_Employee[3];
        
        B_Employee obj1 = new B_Employee("Cathy", 200);
        B_Employee obj2 = new B_Employee("Albert", 300);
        B_Employee obj3 = new B_Employee("Brat", 100);
        
        arrEmp[0] = obj1;
        arrEmp[1] = obj2;
        arrEmp[2] = obj3;
        
        
        /**
         * Exception - We need Comparable implementation
         */
        //Arrays.sort(arrEmp); 
        
        
        /**
         * Anonymous Way
         */
        Arrays.sort(arrEmp, new Comparator<B_Employee>() {
            @Override
            public int compare(B_Employee o1, B_Employee o2) {
                return o1.getId() - o2.getId();
            }   
        });
        System.out.println("Type 1 Anonymous: "+Arrays.toString(arrEmp));
        
        
        //Lambda Way
        Arrays.sort(arrEmp, (e1,e2) -> e1.getId() - e2.getId());
        System.out.println("Type 2 Lambda: "+Arrays.toString(arrEmp));
        
        //Lambda Way - Reverse
        Arrays.sort(arrEmp, (e1,e2) -> e2.getId() - e1.getId());
        System.out.println("Type 3 Lambda Rev: "+Arrays.toString(arrEmp));

        /**
         * comparing() for Natural ordering only
         * No reverse possible
         */
        Arrays.sort(arrEmp, Comparator.comparingInt(B_Employee::getId));  //Method Reference
        System.out.println("Type 4 Comparing: "+Arrays.toString(arrEmp));
    }


    public static void comparatorListEg2(){
        List<B_Employee> listEmp = new ArrayList<>();
        B_Employee obj1 = new B_Employee("Carla", 2000);
        B_Employee obj2 = new B_Employee("Ana", 3000);
        B_Employee obj3 = new B_Employee("Bella", 1000);
        listEmp.add(obj1);
        listEmp.add(obj2);
        listEmp.add(obj3);

        /**
         * Exception - We need Comparable implementation
         */
        //Collections.sort(listEmp);


        /**
         * Anonymous Way
         */
        Collections.sort(listEmp, new Comparator<B_Employee>() {
            @Override
            public int compare(B_Employee o1, B_Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Type 1 Anonymous: "+ listEmp);


        //Lambda Way
        Collections.sort(listEmp,(x,y) -> x.getName().compareTo(y.getName()));
        System.out.println("Type 2 Lambda: "+ listEmp);

        //Lambda Way - Rev
        Collections.sort(listEmp,(x,y) -> y.getName().compareTo(x.getName()));
        System.out.println("Type 3 Lambda Rev: "+ listEmp);

        /**
         * comparing() for Natural ordering only
         * No reverse possible
         */
        Collections.sort(listEmp, Comparator.comparing(B_Employee::getName));
        System.out.println("Type 4 Comparing: "+ listEmp);
    }

    
    public static void main(String[] args) {
        //comparatorArrayEg1();
        //System.out.println("============================================");
        comparatorListEg2();
        System.out.println("============================================");
    }
}
