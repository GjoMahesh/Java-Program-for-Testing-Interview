package Test.PLayGround;

import java.util.ArrayList;
import java.util.List;

public class UserDefiedSorted {
     
    Integer x, y; 
    UserDefiedSorted(Integer x, Integer y) { 
        this.x = x; 
        this.y = y; 
    } 
      
    public String toString() {  
        return this.x + ", "+ this.y; 
    }  
} 
  
class GFG 
{ 
    public static void main(String[] args) 
    { 
  
        List<UserDefiedSorted> aList = new ArrayList<>(); 
        aList.add(new UserDefiedSorted(10, 20)); 
        aList.add(new UserDefiedSorted(5, 10)); 
        aList.add(new UserDefiedSorted(1, 100)); 
        aList.add(new UserDefiedSorted(50, 2000)); 
  
        // displaying the stream with elements 
        // sorted according to x coordinate 
        aList.stream() 
        .sorted((p1, p2)->p1.x.compareTo(p2.x)) 
        .forEach(System.out::println); 
        System.out.println(aList);
    } 
}
