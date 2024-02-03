package BasicJava.Pattern_Code;

import java.util.Scanner;

public class PatternDemo8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter line number:");
        n = input.nextInt();

        for (int col = 1; col <= n; col++) {
            char ch = 'A';  //character pattern 
            for (int row = 1; row <= col; row++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        

        for (int col = n - 1; col >= 1; col--) {
            char ch = 'A'; //character pattern 
            for (int row = 1; row <= col; row++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
