package Test.PLayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethod {
    public static void main(String[] args) {
        
        //operation of filtering out the elements with an upperCase letter at index 1. 

            // Creating a stream of strings 
            Stream<String> stream = Stream.of( "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks"); 
            List<String> arrStr = Arrays.asList("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
            ArrayList<String> arrListStr = new ArrayList<String>(Arrays.asList("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks"));
            String[] arrString = {"Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks"};
            List<String> arrStringList = Arrays.asList(arrString);
            // Getting a stream consisting of the 
            // elements having UpperCase Character 
            // at custom index say be it '1' 
            // using Stream filter(Predicate predicate) 
            
            stream 
                .filter( str -> Character.isUpperCase(str.charAt(1))) 
                .forEach(System.out::println); 

            arrStr.stream()
                    .filter(str -> Character.isUpperCase(str.charAt(1)))
                    .forEach(System.out::println);

            arrListStr.stream()
                        .filter(str -> Character.isUpperCase(str.charAt(1)))
                        .forEach(System.out::println);
            
            arrStringList.stream()
                        .filter(str -> Character.isUpperCase(str.charAt(1)))
                        .forEach(System.out::println);


        // Endwith "S"

            // Creating a stream of strings 
            Stream<String> stream1 = Stream.of( 
                "Geeks", "foR", "GeEksQuiz", "GeeksforGeeks"); 
    
            // Getting a stream consisting of the 
            // elements ending with 's' 
            // using Stream filter(Predicate predicate) 
            stream1.filter(str -> str.endsWith("s")) 
                    .forEach(System.out::println); 
    }
}
