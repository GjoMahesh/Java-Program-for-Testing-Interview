package Test.PLayGround;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {5,1,4,4};
        // List<int[]> listArr = Arrays.asList(arr);

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i+1]){
                count = count + 1;
             }
        }
       

    }
}
