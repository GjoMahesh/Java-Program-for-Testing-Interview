package Test.PLayGround;

public class StringMan {
    public static void main(String[] args) {

        /////////// FIRST ////////////

        String str = "aaabbbbccdddeeeeeffff";
        // output : a3b4c2d3e5f4
        int count = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length() - 1; i++) {
            if (i == str.length() - 2) {
                sb.append(str.charAt(i));
                sb.append(count + 1);
            } else if (str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            } else {
                count += 1;
            }
        }
        System.out.println(sb);

        ////////////////// SECOND ////////////////

        String s = "test12pop90java989python";
        // output : tset12pop90avaj989nothyp
        char str1[] = s.toCharArray();
        StringBuffer reverseText = new StringBuffer();
        StringBuffer reverseTextStraightNumber = new StringBuffer();

        for (int i = 0; i < s.length() - 1; i++) {
            if (i == s.length() - 2) {
                reverseText.insert(0, str1[i]);
                reverseText.insert(0, str1[i + 1]);
                reverseTextStraightNumber.append(reverseText);
            } else if (Character.isDigit(s.charAt(i))) {
                reverseTextStraightNumber.append(str1[i]);
            } else if (Character.isLetter(s.charAt(i)) == Character.isDigit(s.charAt(i + 1))) {
                reverseTextStraightNumber.append(str1[i]);
                reverseTextStraightNumber.append(reverseText);
                reverseText.setLength(0);
            } else {
                reverseText.insert(0, str1[i]);
            }
        }

        System.out.println(reverseTextStraightNumber);
        System.out.println(0.1 + 0.2);
        System.out.println(1.0 + 0.5);
        System.out.println(0.0/0.0);
        System.out.println(9/0.0);
    }
}
