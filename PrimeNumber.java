package Test.PlayGround_old;
import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Enter starting value");
        int min = in.nextInt();
        System.out.println(" Enter Ending value");
        int max = in.nextInt();

        while(min < max){
            if(checkPrimeNumber(min)){
                System.out.print(min + " ");
            }
            min++;
        }

        in.close();
    }

public static boolean checkPrimeNumber(int num){
    boolean flag = true;
    for(int i = 2; i < num/2 ; i++){
        if(num%i == 0){
            flag = false;
            break;
        }
    }
    return flag;


}

}