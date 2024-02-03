package BasicJava.Pattern_Code;

import java.util.Scanner;

public class PatternDemo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int n;
        System.out.print("Enter line number:");
        n = input.nextInt();

        for (int col = 1; col <= n; col++) {
            char ch = 'A';
            for (int row = 1; row <= col; row++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }


    }
    
}
