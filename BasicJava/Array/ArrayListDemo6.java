package BasicJava.Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);

        System.out.println("Beforre Sorting (Array List):" + number);
        System.out.println();

        // sorting(ascending order)
        Collections.sort(number);
        System.out.println("After sorting (ascending order):" + number);

        // sorting(descending order)
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After Sorting (descending order):" + number);
        
        
    }
}
