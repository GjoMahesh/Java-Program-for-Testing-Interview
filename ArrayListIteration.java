package Test.PLayGround;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {

        System.out.println("=================");
        System.out.println("=================");

        ArrayList<String> stdName = new ArrayList<String>();
        stdName.add("jijo");
        stdName.add("Arun");
        stdName.add("shaik");
        stdName.add("prigith");

        System.out.println(stdName);

        System.out.println("=================");

        // Typical for loop
        for (int i = 0; i < stdName.size(); i++) {
            System.out.println(stdName.get(i));
        }

        System.out.println("=================");
        System.out.println("=================");
       
        // Enanched For loop
        for (String s : stdName) {
            System.out.println(s);
        }

        System.out.println("=================");
        System.out.println("=================");

        // steam with lambda
        stdName.stream().forEach(ele -> System.out.println(ele));

        System.out.println("=================");
        System.out.println("=================");

        // Iterator
        Iterator<String> stdNameIter = stdName.iterator();

        while (stdNameIter.hasNext()) {
            System.out.println(stdNameIter.next());
        }
    }
}
