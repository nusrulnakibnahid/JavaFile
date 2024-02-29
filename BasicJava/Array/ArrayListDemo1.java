package BasicJava.Array;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size: " + number.size());

        // adding elements
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(3, 10);

        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Size of elements:" + number.size());

    }
}
