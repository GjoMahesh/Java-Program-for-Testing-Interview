package Test.PLayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DuplicateWords {

    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";

        // Convert the string to lowercase
        string = string.toLowerCase();

        // Split the string into words
        String[] words = string.split(" ");

        // Create a HashMap to store the duplicate words
        Map<String, Integer> duplicateWords = new HashMap<>();

        // Iterate over the words and count the number of occurrences of each word
        for (String word : words) {
            if (duplicateWords.containsKey(word)) {
                duplicateWords.put(word, duplicateWords.get(word) + 1);
            } else {
                duplicateWords.put(word, 1);
            }
        }

        // Print the duplicate words and their count
        for (Map.Entry<String, Integer> entry : duplicateWords.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        
        String string1 = "This is a a a is is is sample string";
        List<String> words1 = Arrays.asList(string1.split(" "));

        Map<String, Integer> wordCountMap = words1.stream()
                .collect(Collectors.toMap(word -> word, word1 -> 1, Integer::sum));

                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                        if (entry.getValue() > 1) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                            
                        }
            
                    }

/* 
        System.out.println(wordCountMap);
        Map.Entry<String, Integer> entry = wordCountMap.entrySet().stream().filter((e,i) -> e.getValue() = i.getValue()).findFirst().get();
          // Get the value of the entry.
          Integer value = entry.getValue();

          // Print the value.
          System.out.println(value);
        // TreeMap<String, Integer> treeMap = new TreeMap<>(wordCountMap);
        // System.out.println(treeMap);

        // List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCountMap.entrySet());
        // list.stream() 
        //     .sorted((p1, p2)-> ,p1.compareTo(,p2)) 
        //     .forEach(System.out::println);

            Map<String, Integer> sortedMap = wordCountMap.entrySet().stream()
                                                .sorted(Map.Entry.comparingByValue())
                                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            System.out.println(sortedMap);

         // Print the duplicate words and their count
        //  */


    }
}