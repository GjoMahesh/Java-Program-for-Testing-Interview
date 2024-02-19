package Test.PLayGround;

import java.util.Arrays;

public class SortedIntString {
    public static void main(String[] args) {
        String name = "Bharat88990"  ;
        // o/p = "88990"
        StringBuffer newName = new StringBuffer();

        for(int i = 0; i <= name.length() - 1; i++){
        if(Character.isDigit(name.charAt(i))){
            newName.append(name.charAt(i));
        }
    }
        System.out.println(newName);


        ////////////////

        // Sorting array without using sort function Array= (20,30,5,2,7,50)

        // ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(20,30,5,7,2,50));
        int[] num = new int[]{12,50,1,36,85};
        String strnum = num.toString();
       // System.out.println(strnum);
        int arrSize = num.length;
        // System.out.println(arrSize);
        StringBuffer newNum = new StringBuffer(strnum);
        for(int i = 0; i < arrSize -2; i++){
            if(num[i] < num[i + 1]){
                newNum.insert(0, num[i + 1]);
            }
            //o/p: 30
        }
        System.out.println(newNum.toString());


        //////////
        int a[]={6,2,5,1};
            System.out.println(Arrays.toString(a));
             int temp;
             for(int i=0;i<a.length-1;i++){
                 for(int j=0;j<a.length-1;j++){
                     if(a[j] > a[j+1]){   // use < for Descending order
                         temp = a[j+1];
                         a[j+1] = a[j];
                         a[j]=temp;
                     }
                 }
             }
            System.out.println(Arrays.toString(a));


        String str = "Hello, World!";

        // Convert the string to a character array
        char[] chars = str.toCharArray();

        // Sort the character array
        Arrays.sort(chars);

        // Convert the character array back to a string
        String sortedStr = new String(chars);

        // Print the sorted string
        System.out.println(sortedStr);


    }
}
