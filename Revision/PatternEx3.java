package Revision;

import java.util.Scanner;

public class PatternEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter line number: ");
        n = input.nextInt();

        for (int col = 1; col <= n; col++) {

            for (int row = 1; row <= col; row++) {
                System.out.print(" " + row);
            }
            System.out.println();
        }
    }
}
