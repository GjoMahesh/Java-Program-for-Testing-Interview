package Test.PLayGround;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        

        // default Array comes without the word Array, [] means Array
        int i[] = new int[4];

        // Second Type to initialize array
        int[] j = {1, 2, 3, 4};

        String[] k = { "Arun", "Kumar", "Sandhib"};
        

        // String Literals vs new String Object
        
        String same = "sameName";
        String same1 = "sameName";
        String same2 = new String("sameName");

        if( same == same1){
            System.out.println("true");
        }
        if( same1.equals(same2)){
            System.out.println("true");
        }
        if( same == same2){
            System.out.println("true");
        }else
            System.out.println(false);



    }
}
