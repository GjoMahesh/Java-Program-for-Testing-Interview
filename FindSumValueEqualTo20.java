package Test.PLayGround;

public class FindSumValueEqualTo20 {
    public static void main(String[] args) {
    
        int[] numArr = {12,9,3,11,5,8};

        int numSize = numArr.length;

        for(int i = 0; i < numSize; i++){
            for(int j = 1; j < numSize ; j++){
                if( numArr[i] + numArr[j] == 20 ){

                    System.out.println( numArr[i] + " : " + numArr[j] );
                
                }
            }
            
        }
        
}
}