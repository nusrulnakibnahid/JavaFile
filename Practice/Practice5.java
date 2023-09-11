package Practice;

import java.util.Scanner;
//Write a program to take two integer inputs from user and print divide and Part out of them.
public class Practice5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double x,y,part_end;

        System.out.print("Enter x = ");
        x = input.nextDouble();

        System.out.print("Enter y = ");
        y = input.nextDouble();


        part_end = x%y;  //'%' means part out 

        System.out.print("Part out of xy = "+part_end);


    }
    
}
