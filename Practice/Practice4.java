package Practice;

import java.util.Scanner;

public class Practice4 {
    //Write a program to take two integer inputs from user and print divide and product of them.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x,y,div;

        System.out.print("Enter x = ");
        x = input.nextDouble();

        System.out.print("Enter y = ");
        y = input.nextDouble();

        div = x/y;

        System.out.print("Division of xy = "+div);
        
    }
    
}
