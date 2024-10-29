package A_Collection.Sorting;

import java.util.*;

/**
 * Binary Search
 * Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
 * In case of binary search, array elements must be in ascending order
 * 
 * @author Sheetal Singh
 */
public class E_BinarySearch {

    /**
     * Search for a "known" keyword
     * Return 0 based index from a sorted list
     */
    public static void binarySearch1() {
        List<String> names = Arrays.asList("Zulu", "Alpha", "Oscar", "Victor");
        Collections.sort(names);    // natural order sort
        System.out.println(names);  // [Alpha, Oscar, Victor, Zulu]

        System.out.println(Collections.binarySearch(names, "Oscar"));
    }


    /**
     * In case searching for "unknown" keyword
     * -(idealIndexWhichWouldHaveBeenIfPresent) -1
     * -(1)-1  
     * -2
     */
    public static void binarySearch2() {
        List<String> names = Arrays.asList("Zulu", "Alpha", "Oscar", "Victor");
        Collections.sort(names);    // natural order sort
        System.out.println(names);  // [Alpha, Oscar, Victor, Yu, Zulu]

        System.out.println(Collections.binarySearch(names, "Yu"));
    }
    
    public static void main(String[] args) {
         //binarySearch1();
         binarySearch2();
    }
    
}
