package Test.PLayGround;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "I am from California";
        String reversedString = reverseWords(str);
        System.out.println(reversedString);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverseString(word)).append(" ");
        }

        // Remove the trailing space
        return result.toString().trim();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}