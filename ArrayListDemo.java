package Test.PLayGround;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Defalult ArrayList generics
        // The Defalut ArrayList is not recommend in java, it gives warring
        // It can store any value's like int,String,float,char,boolean.
        ArrayList arr = new ArrayList<>();

        // This <Object> Object/raw type Generic to remove the warning.
        ArrayList<Object> arr1 = new ArrayList<Object>();
        arr1.add(100);
        arr1.add('s');
        arr1.add("Name");
        arr1.add(12.52);
        arr1.add(true);

        System.out.println(arr1.size() + " : " + arr1.get(2));

        System.out.println("=================");
        System.out.println("=================");

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(100);
        System.out.println(intList);

        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(12.0);
        System.out.println(doubleList);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("name");
        System.out.println(stringList);

        ArrayList<CharSequence> charList = new ArrayList<CharSequence>();
        charList.add("name");
        System.out.println(charList);

        System.out.println("=================");
        System.out.println("=================");

        ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(100,10,15,12,45));
        System.out.println(intList1);

        ArrayList<String> strList1 = new ArrayList<String>(Arrays.asList("Jijo","Manoj","test","Demo"));
        System.out.println(strList1);
        
    }
}
