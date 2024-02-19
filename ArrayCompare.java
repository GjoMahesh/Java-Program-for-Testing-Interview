package Test.PLayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCompare {
    public static void main(String[] args) {

        // Sort and Equal | Anagram
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("A","C","B","D","G","E"));
        
        ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("C","B","G","E","D","A"));
        
        ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(1,5,8,6,4,3,8,7));

        // return Boolean
        Collections.sort(arr);
        Collections.sort(arr1);
        Collections.sort(arr3);

        System.out.println(arr);
        System.out.println(arr.equals(arr1));
        System.out.println(arr.equals(arr3));

        // Compare to list and find out addtional elements:
        ArrayList<String> arrCampare = new ArrayList<String>(Arrays.asList("Jijo","C","manoj","mercy","G","E"));
        
        ArrayList<String> arrCampare1 = new ArrayList<String>(Arrays.asList("Jijo","C","manoj","D","p","E"));

        arrCampare.removeAll(arrCampare1);
        System.out.println(arrCampare);

        // Findout the missing elements;
        ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("Jijo","C","manoj","mercy","G","E"));
        
        ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("Jijo","C","manoj","D","p","E"));

        a2.removeAll(a1);
        System.out.println(a2);

        // Find out the Common elements;

        ArrayList<String> a3 = new ArrayList<>(Arrays.asList("Jijo", "Manoj", "Mahesh", "Antony"));
        ArrayList<String> a4 = new ArrayList<>(Arrays.asList("Jijo", "Joy", "Manoj", "Antony"));

        a3.retainAll(a4);
        System.out.println(a3);

        String str = "listen";

        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        // Print the array of characters
        for (char c : charArray) {
            System.out.println(c);

         }
    }
}
