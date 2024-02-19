package Test.PLayGround;


public class ReverseStringAndMaintainTheSpace {
    public static void main(String[] args) {
        String str = "I am from California";
        String revered = "";

        String withoutSpace = str.replace(" ", "").toLowerCase();
        
        
        for (int i = withoutSpace.length() - 1 ; i >= 0 ; i-- ){
            System.out.print(withoutSpace.charAt(i)); 
            revered = revered + withoutSpace.charAt(i);
        }

        StringBuffer sb = new StringBuffer(revered);
        System.out.println("old : " + sb);

        for(int i = 0; i <= withoutSpace.length() - 1  ; i++ ){
            if(str.charAt(i) == ' '){
                sb.insert(i, ' ');
            }
        }

        System.out.println("New : " + sb);
      }
    }

