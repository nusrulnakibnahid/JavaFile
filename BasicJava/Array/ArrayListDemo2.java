package BasicJava.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size: " + number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 60);

        // use iterator method for this array list
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());

        }
        System.out.println();
        System.out.print("Size Now: " + number.size());

    }
}
