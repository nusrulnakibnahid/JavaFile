package BasicJava.Pattern_Code;

import java.util.Scanner;

public class PatternDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 

        int n;
        System.out.print("Enter line number:");
        n = input.nextInt(); 

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* " );  //Star pattern
            }
            System.out.println();
        }


        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* " ); //Star pattern
            }
            System.out.println();
        }

        
    }
}
