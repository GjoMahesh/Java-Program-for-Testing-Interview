package Test.PLayGround;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoneMatchMethod {
    public static void main(String[] args) {


        // To check that there is no string of length 4. 

        Stream<String> stream = Stream.of("CSE", "C++", "Java", "DS"); 
        boolean answer = stream.noneMatch(str -> (str.length() == 5)); 
  
        // Printing the boolean value on the console 
        System.out.println(answer); 



        // To check that there is no element less than 0. 

        List<Integer> list = Arrays.asList(4, 0, 6, 2); 
        boolean answer1 = list.stream().noneMatch(num -> num < 0); 
        // Printing and displaying the above boolean value 
        System.out.println(answer1); 



        // To check that there is no element with required characters at required position. 

        Stream<String> stream2 = Stream.of("fEeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks", "CSe"); 
  
        boolean answer2 = stream2.noneMatch( str -> Character.isUpperCase(str.charAt(1)) 
                   && Character.isLowerCase(str.charAt(2)) 
                   && str.charAt(0) == 'f'); 
  
        // Printing the above boolean value on console 
        System.out.println(answer2); 

        // Creating a Stream of Strings
        // List<String> stream3 = Arrays.asList("Geeks", "for","GeeksQuiz", "GeeksforGeeks");

        Stream<String> stream4 = Stream.of("Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        // Check if all elements of stream
        // have length greater than 2 using
        // Stream allMatch(Predicate predicate)
        boolean answer3 = stream4.allMatch(str -> str.length() > 2);
        System.out.println(answer3);


    }
}
