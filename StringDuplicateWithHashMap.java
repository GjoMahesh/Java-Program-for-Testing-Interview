package Test.PLayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringDuplicateWithHashMap {
    public static void main(String[] args) {

        // Identify the number of repeated characters in a string using HashMap -- String str = "google";
        String str = "google";
       // StringBuffer strnew = new StringBuffer(str);

        Map<Character,Integer> countStr = new HashMap<Character,Integer>();

        for(int i = 0; i < str.length() ; i++){

            if(  countStr.containsKey(str.charAt(i))  ){
                
                countStr.put(str.charAt(i) , countStr.get(str.charAt(i)) + 1 );
                
            }else {
                countStr.put(str.charAt(i),  1 );
            }
        }

        System.out.println(countStr);
       

        ////////////////////

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Jijo", "manoj", "Arun"));

        name.stream().forEach(System.out::println);

    }
}
