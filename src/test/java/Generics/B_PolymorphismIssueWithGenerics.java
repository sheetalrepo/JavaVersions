package Generics;

import java.util.ArrayList;
import java.util.List;

public class B_PolymorphismIssueWithGenerics {


    /**
     * <Child> class cannot be added into <Parent> class in Generics
     *      class Integer extends Number
     */
    public static void polymorphicIssue1() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        
        List<Number> list2 = new ArrayList<>();
        //list2 = list1;
    }
    
    
    /**
     * Polymorphic issue:
     *  - Java don't allow <Integer> to be added into <Object>
     *      otherwise <String> could have been added as well in <Object>
     *          and list become the mix of Integer and String
     */    
    public static void polymorphicIssue2(){
       List<Integer> list = new ArrayList<>(); 
       list.add(10);
       list.add(20);
       list.add(30);

       //List<Object> objectList = list;          // Compiler error
       //objectList.add("Obj can have anything"); // If no compiler then we could have added anything
    }

    /**
     * Accept List<Object> and print them
     */
    public static void accept(List<Object> objList) {
        for (Object o: objList){
            System.out.println(o);
        }
    }

    public static void polymorphicIssue3(){
        List<String> listStr = new ArrayList<>();
        listStr.add("A");
        listStr.add("B");
        listStr.add("C");

        //accept(listStr);  //Not allowed to pass <String> to <Object>
    }

   
    public static void main(String[] args) {
        polymorphicIssue1();
        polymorphicIssue2();
        polymorphicIssue3();
    }
}
