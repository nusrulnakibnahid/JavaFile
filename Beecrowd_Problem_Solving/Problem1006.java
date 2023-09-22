package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Read three values (variables A, B and C), which are the three student's grades.
Then, calculate the average, considering that grade A has weight 2, grade B has
weight 3 and the grade C has weight 5. Consider that each grade can go
from 0 to 10.0, always with one decimal place. */

public class Problem1006 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double A, B, C,average;

        System.out.print("Enter A: ");
        A = input.nextDouble(); 

        System.out.print("Enter B: ");
        B = input.nextDouble(); 

        System.out.print("Enter C: ");
        C = input.nextDouble();  


        average = (A/10*2) + (B/10*3) + (C/10*5); 
        System.out.println("Average of A,B & C: "+average);

    }
}