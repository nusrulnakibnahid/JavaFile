package BasicJava.Pattern_Code;

import java.util.Scanner;

public class PatternDemo13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter line number:");
        n = input.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        
        for (int row = n - 1; row >= 1; row--) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

    }
}
