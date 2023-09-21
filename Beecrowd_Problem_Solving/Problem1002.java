package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*The formula to calculate the area of a circumference is defined as A = π . R2. Considering to this problem that π = 3.14159.
Calculate the area using the formula given in the problem description. */
public class Problem1002 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        double A,R; //A=Area ,R=Radius

        System.out.print("Enter Radius: ");
        R = input.nextDouble(); 

        A = 3.14159 * (R *R);
        System.out.println("Area of a circumference: "+A);


    }
}
