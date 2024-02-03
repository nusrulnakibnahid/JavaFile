package BasicJava.Pattern_Code;

import java.util.Scanner;

public class PatternDemo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter line number:");
        n = input.nextInt();

        for (int row = 1; row <= n; row++) {

            // Print leading spaces for alignment
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  "); // Two spaces for better spacing
            }
 
            // Print numbers in decreasing order from col to 1
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
 
            System.out.println(); // Move to the next line
        }

    }
}
