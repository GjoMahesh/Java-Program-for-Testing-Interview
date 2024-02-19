package Test.PLayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> family = new ArrayList<String>(Arrays.asList("jijo", "Manoj", "Mercy"));

        ArrayList<String> friends = new ArrayList<String>(Arrays.asList("Prigith", "Arun", "Shaik"));

        // addAll() we can use this to join add to ArrayList
        // addAll(position,ListObject)
        friends.addAll(0, family);
        System.out.println(friends);
        // Output : [jijo, Manoj, Mercy, Prigith, Arun, Shaik]

        // addAll() add the list at the end of an another list
        friends.addAll(family);
        System.out.println(friends);
        // Output : [jijo, Manoj, Mercy, Prigith, Arun, Shaik, jijo, Manoj, Mercy]

        // clone() use to create copy/clone of the ArrayList
        ArrayList<String> twoFriendGroup = (ArrayList<String>)friends.clone();
        System.out.println(twoFriendGroup);
        // Output : [jijo, Manoj, Mercy, Prigith, Arun, Shaik, jijo, Manoj, Mercy]

        // contains() return boolean
        System.out.println(friends.contains("Prigith"));
        // Output : true

        // lastIndexof() is print the last index of giving String lastIndexof("jijo")
        System.out.println("Get the By Index 5 : " + friends.get(5));
        // Output : [jijo, Manoj, Mercy, Prigith, Arun, Shaik, jijo, Manoj, Mercy]
        System.out.println(friends.lastIndexOf("jijo"));
        // Output : 6

        // remove() is used to remove the element of given index
        System.out.println(friends.remove(1));
        // Output : Manoj
        System.out.println(friends);
        // Output : [jijo, Mercy, Prigith, Arun, Shaik, jijo, Manoj, Mercy]

        // removeIf() it remove the element if condtion is true
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.removeIf(n -> n%2 != 0);
        System.out.println(numbers);
        // Output : [2, 4, 6, 8]

        // retainAll() use to take the all String with same value as passed
        ArrayList<String> name = new ArrayList<>(Arrays.asList("jam", "jijo", "king", "jijo", "manoj", "manoj"));
        name.retainAll(Collections.singleton("jijo"));
        System.out.println(" this out for ratain All using singleton : " + name);
        // Output : [jijo, jijo]

        // toArray();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("jam", "jijo", "king", "jijo", "manoj", "manoj"));
        Object arrNames[] = names.toArray();
        System.out.println(arrNames);
        // Output : [Ljava.lang.Object;@33c7353a
        
        System.out.println(Arrays.toString(arrNames));
        // Output : [jam, jijo, king, jijo, manoj, manoj]
       
        for(String nam : names){
            System.out.println(nam);
        }
        // Output : 
        // jam
        // jijo
        // king
        // jijo
        // manoj
        // manoj
    }
}
