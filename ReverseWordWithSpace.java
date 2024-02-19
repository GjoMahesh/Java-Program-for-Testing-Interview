package Test.PLayGround;

public class ReverseWordWithSpace {
    public static void main(String[] args) {
        String str = "testing is good";
        // output : gintest si doog

        String[] list = str.split(" ");
        StringBuffer newStr = new StringBuffer();
        int listSize=list.length  ;

        for(int i = 0; i < listSize ; i++){

            String oneWord = list[i];
            System.out.println(oneWord);
            newStr.append(reversever(oneWord));
            newStr.append(" ");
        }   

        System.out.println(newStr);
    }

    public static String reversever(String oneWord){

        StringBuffer newStr = new StringBuffer();
        for(int j = 0; j <= oneWord.length() - 1; j++){
            newStr.insert(0, oneWord.charAt(j));
        }

        return newStr.toString();
    }
   
}
