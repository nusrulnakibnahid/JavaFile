package BasicJava.Array;

//Easiest way to adding & removing elements in ArrayList
import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size:" + number.size());

        // adding e;lements
        number.add(30);
        number.add(50);
        number.add(70);
        number.add(90);
        number.add(100);

        System.out.println("Array List Contains:" + number);
        System.out.println("Size:" + number.size());

        System.out.println();

        // removing elements
        number.remove(3);
        System.out.println("After Remove Array List Contains Now:" + number);
        System.out.println("Size Now:" + number.size());

    }
}
