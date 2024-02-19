package Test.PLayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {

        // LinkedHashSet
        ArrayList<Integer> arrNum = new ArrayList<Integer>(
                Arrays.asList(1, 2, 5, 3, 2, 1, 4, 5, 6, 8, 54, 216, 8, 0, 42, 65, 41, 13, 35, 4));

        LinkedHashSet<Integer> numSet = new LinkedHashSet<Integer>(arrNum);

        ArrayList<Integer> numWithoutDuplicate = new ArrayList<Integer>(numSet);
        System.out.println(numWithoutDuplicate);

        String string1 = "This is a a a is is is sample string";
        List<String> words1 = Arrays.asList(string1.split(" "));
        
        LinkedHashSet<String> wordSet = new LinkedHashSet<String>(words1);
        System.out.println(wordSet);

        // Stream
        ArrayList<Integer> arrNum1 = new ArrayList<Integer>(
            Arrays.asList(1, 2, 5, 3, 2, 1, 4, 5, 6, 8, 54, 216, 8, 0, 42, 65, 41, 13, 35, 4));

        List<Integer> numWithoutDuplicate1 = arrNum1.stream().distinct().collect(Collectors.toList());
        System.out.println(numWithoutDuplicate1);

        String string2 = "This is a a a is is is sample string";
        List<String> words2 = Arrays.asList(string2.split(" "));
        
        List<String> nonDupList = words2.stream().distinct().collect(Collectors.toList());
        System.out.println(nonDupList);


    }
}
