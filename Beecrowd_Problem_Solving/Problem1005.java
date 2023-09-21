package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Read two floating points' values of double precision A and B, corresponding to two student's grades.
After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5.
Each grade can be from zero to ten,always with one digit after the decimal point.
Don’t forget to print the end of line after the result */

public class Problem1005 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        float A,B,grade;

        System.out.print("Enter A:");
        A = input.nextFloat(); 

        System.out.print("Enter B:"); 
        B = input.nextFloat(); 

        grade = (float) ((A/11 *3.5) + (B/11 * 7.5));

        System.out.println("Grade is: " + grade);
       
    }
}