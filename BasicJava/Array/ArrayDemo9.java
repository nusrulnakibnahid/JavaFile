package BasicJava.Array;

import java.util.Arrays;

public class ArrayDemo9 {
    public static void main(String[] args) {

        int[] number = { 100, 95, 102, -3, 56 };
        Arrays.sort(number);

        // Ascending order of numbers
        System.out.print("Ascending order:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + number[i]);
        }

        System.out.println();

        // Decending order of numbers
        System.out.print("Decending order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + number[i]);
        }
        System.out.println();


        
        String[] name = { "b", "f", "x", "z", "d" };
        Arrays.sort(name);

        // Ascending order for string
        System.out.print("Ascending order:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + name[i]);
        }
        System.out.println();



        // Decending order for string
        System.out.print("Decending order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + name[i]);
        }

    }
}