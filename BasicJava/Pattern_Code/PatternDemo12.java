package BasicJava.Pattern_Code;

import java.util.Scanner;

public class PatternDemo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter line number:");
        n = input.nextInt();

        for (int row = n; row >= 1; row--) {
            // Print leading spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

}