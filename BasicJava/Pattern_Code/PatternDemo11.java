package BasicJava.Pattern_Code;

import java.util.Scanner;

public class PatternDemo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int n;
        System.out.print("Enter line number:");
        n = input.nextInt(); 

        for (int row = 1; row<= n; row++) {
            // Print leading spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
 
            // Print characters from A to current row number
            for (char ch = 'A'; ch <= 'A' + row - 1; ch++) {
                System.out.print(ch + " ");
            }
 
            System.out.println();
        }
    }
}