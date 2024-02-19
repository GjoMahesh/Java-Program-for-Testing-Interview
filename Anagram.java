package Test.PLayGround;

import java.util.HashMap;


public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        // Create a HashMap to store the character frequencies of the first string
        HashMap<Character, Integer> charFreqs1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (charFreqs1.containsKey(c)) {
                charFreqs1.put(c, charFreqs1.get(c) + 1);
            } else {
                charFreqs1.put(c, 1);
            }
        }

        // Create a HashMap to store the character frequencies of the second string
        HashMap<Character, Integer> charFreqs2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            if (charFreqs2.containsKey(c)) {
                charFreqs2.put(c, charFreqs2.get(c) + 1);
            } else {
                charFreqs2.put(c, 1);
            }
        }

        // Compare the two HashMaps
        if (charFreqs1.equals(charFreqs2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        boolean isAnagram = isAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }
}