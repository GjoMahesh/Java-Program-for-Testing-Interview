package Test.PLayGround;

import java.util.Scanner;

public class StringChallenge {

  public static String StringChallenge(String str) {
    // code goes here
    StringBuffer interChangeCase = new StringBuffer();
    String yourChallengeToken = "lkgyeu05v2b";
    StringBuffer finalOutput = new StringBuffer();
    for (char st : str.toCharArray()) {
      if (Character.isUpperCase(st)) {
        interChangeCase.append(Character.toLowerCase(st));
      } else if (Character.isLowerCase(st)) {
        interChangeCase.append(Character.toUpperCase(st));
      } else {
        interChangeCase.append(st.charAt(i));
      }
    }

    System.out.println(interChangeCase);

    for (int i = 0; i < str.length() - 1; i++) {
      if (i < str.length() - 2) {
        finalOutput.append(interChangeCase.charAt(i));
        finalOutput.append(yourChallengeToken.charAt(i));

      }
    }

    finalOutput.append(yourChallengeToken.substring(str.length() - 2));

    System.out.println(finalOutput);

    return interChangeCase.toString();
  }

  public static void main(String[] args) {
    try (// keep this function call here
        Scanner s = new Scanner(System.in)) {
      System.out.print(StringChallenge(s.nextLine()));
    }
  }

}
