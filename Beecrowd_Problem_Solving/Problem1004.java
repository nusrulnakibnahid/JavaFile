package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Read two integer values. After this, calculate the product between them and store the result in a variable named PROD.
Print the result like the example below.Do not forget to print the end of line after the result. */
public class Problem1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int a,b,PROD;

        System.out.print("Enter a : ");
        a =input.nextInt(); 

        System.out.print("Enter b : "); 
        b = input.nextInt();

        PROD = a*b;
        System.out.print("Multiplication of a & b: "+PROD);

    }
}
