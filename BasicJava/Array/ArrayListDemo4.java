package BasicJava.Array;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size: " + number.size());

        // adding number
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 70);

        System.out.println("Array List: " + number);
        System.out.println("Size: " + number.size());
        System.out.println();

        // clear array list
        number.clear();
        System.out.println("After clear array list now: " + number);
        System.out.println("Size: " + number.size());
        System.out.println();

        // check array list empty or not!
        boolean b = number.isEmpty(); // if array list is empty print "true"
        System.out.println("Array list size: " + number.size());
        System.out.println("Array list is empty?: " + b);

        System.out.println();

        // adding number again
        number.add(75);
        number.add(25);
        number.add(35);
        number.add(48);
        number.add(65);
        number.add(5, 30);
        System.out.println("Array List:" + number);
        System.out.println("Size: " + number.size());

        // contains method
        boolean contain = number.contains(48);
        System.out.println("Is 48 in this array list?: " + contain);
        System.out.println();

        // index checking method
        int position = number.indexOf(48);
        System.out.println("Index of 48 is:" + position);
        System.out.println();

        // set method
        number.set(3, 100); // replace
        System.out.println("Array list:" + number);
        System.out.println();

        // get method
        int x = number.get(1);
        System.out.println("Index of 1 is: " + x);

    }
}