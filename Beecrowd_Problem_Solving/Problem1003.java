package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Read two integer values, in this case, the variables A and B.
After this, calculate the sum between them and assign it to the variable SOMA. 
Write the value of this variable. */
public class Problem1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int A,B,SOMA;

        System.out.print("Enter A = ");
        A =  input.nextInt(); 

        System.out.print("Enter B = ");
        B = input.nextInt();  

        SOMA = A + B; //Calculate the sum 

        System.out.println("Sum of A & B = "+SOMA);


    }
}
