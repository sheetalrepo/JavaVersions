package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Pre Generics Code
 *  - Save everything as Object
 *  - Throw lots of ClassCastException
 *  - No Type Safety
 *  - Casting required everytime
 */
public class A_PreGenerics {

    public static void test1(){
        List list = new ArrayList();
        list.add("Apple");   // String will be saved as Object
        list.add("Mango");
        list.add("Orange");

        String s1 = (String) list.get(0);  // Issue: Casting required else compiler error
        String s2 = (String) list.get(1);
        String s3 = (String) list.get(2);
        
        System.out.println(list);
        System.out.println(s1+" > "+s2+" > "+s3);
        System.out.println("============================================");
    }


    public static void test2(){
        List list = new ArrayList();
        list.add("Apple");
        list.add(2);        //Added by mistake - No compiler error
        list.add("Orange");

        System.out.println(list);
        String s1 = (String) list.get(0);
        String s2 = (String) list.get(1);  // Run time exception
        String s3 = (String) list.get(2);

        System.out.println(list);
        System.out.println(s1+" > "+s2+" > "+s3);
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        test1();
        test2();
    }
}
