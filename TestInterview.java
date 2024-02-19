package Test.PLayGround;

public class TestInterview {
    public static void main(String[] args) {
        
        int num = 12321;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (num == rev) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

         ////////////////////

        int a = 30;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " : " + b);
        
    }
    
    public static void main(String[][] args) {

    }
}
