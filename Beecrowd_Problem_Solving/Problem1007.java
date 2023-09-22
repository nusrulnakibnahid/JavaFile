package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Read four integer values named A, B, C and D. Calculate and print the 
difference of product A and B by the product of C and D (A * B - C * D). */

public class Problem1007 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A,B,C,D,diff;

        System.out.print("Enter A: ");
        A = input.nextInt();

        System.out.print("Enter B: "); 
        B = input.nextInt(); 

        System.out.print("Enter C: "); 
        C = input.nextInt(); 

        System.out.print("Enter D: ");  
        D = input.nextInt();  


        diff = ((A * B) - (C * D)); 
        System.out.println("Difference is: "+diff);

    }
}
