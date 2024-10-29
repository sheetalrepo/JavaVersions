package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics
 *  - It's a "Compile Time Protection Feature"
 *  - Compiler detect if wrong data added
 *  - No more ClassCastException
 *  - Type Safety
 *  - No Casting required
 */
public class A_Generics {

    public static void test1(){
        List<String> list = new ArrayList();
        list.add("Apple");  
        list.add("Mango");
        list.add("Orange");

        String s1 = list.get(0);
        String s2 = list.get(1);
        String s3 = list.get(2);
        
        System.out.println(list);
        System.out.println(s1+" > "+s2+" > "+s3);
        System.out.println("============================================");
    }


    public static void test2(){
        List<String> list = new ArrayList();
        list.add("Apple");
        //list.add(2);        //Compiler detect error
        list.add("Orange");

        String s1 = list.get(0);
        String s2 = list.get(1);

        System.out.println(list);
        System.out.println(s1+" > "+s2);
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        test1();
        test2();
    }
}
