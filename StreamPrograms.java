package Test.PLayGround;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPrograms {
    public static void main(String[] args) {
        
        // Sum of All Numbers
        List<Integer> list = Arrays.asList(1,2,3,8,6,7,8);
        Optional<Integer> sum = list.stream().reduce((a,b) -> a + b);
        System.out.println(sum);
        System.out.println(sum.get());

        // Avg of Numbers
        List<Integer> list1 = Arrays.asList(1,2,3,8,6,7,8);
        Double dbl = list1.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(dbl);

        // Square and Avg onl above 100
        List<Integer> list2 = Arrays.asList(1,10,5,65,12,8);
        Double squareAvg = list2.stream()
                                .map(e -> e*e)
                                .filter(e -> e>100)
                                .mapToInt(e -> e)
                                .average()
                                .getAsDouble();                    

        System.out.println(squareAvg);

        // Print numbers Start with 2
        List<Integer> list3 = Arrays.asList(22,245,856,265,287,85,75,265,22,28,74);
        List<Integer> startNumberWith2 = list3.stream()
                                              .map(e -> String.valueOf(e))
                                              .filter(e -> e.startsWith("2"))
                                              .map(Integer::valueOf)
                                              .collect(Collectors.toList());
        System.out.println(startNumberWith2);

        // Max and Min value
        List<Integer> list4 = Arrays.asList(22,245,856,265,287,85,75,265,22,28,74);
        int max = list4.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = list4.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

        // Sorted Asc /Decs
        List<Integer> list5 = Arrays.asList(22,245,856,265,287,85,75,265,22,28,74);
        List<Integer> sortedNumber = list5.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumber);

        List<Integer> decsNumber = list5.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(decsNumber);

        // Second Highest / Lowest Number
        List<Integer> list6 = Arrays.asList(22,245,856,265,287,85,75,265,22,28,74);
        int secH = list6.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secH);

        int secL = list6.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secL);
    }
}
