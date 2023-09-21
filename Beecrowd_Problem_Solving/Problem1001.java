package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Read 2 variables, named A and B and make the sum of these two variables,
assigning its result to the variable X.Print X as shown below. Print endline after the result. */

public class Problem1001 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A,B,X;

        System.out.print("Enter A: "); 
        A = input.nextInt(); 

        System.out.print("Enter B: ");  
        B = input.nextInt();  


        X = A + B;
        System.out.println("X = " + X); 


    }
}