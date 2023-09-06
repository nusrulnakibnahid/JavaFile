package Practice;

import java.util.Scanner;

//Write a program to take two integer inputs from user and print sum and product of them.
public class Practice {

    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        int x;
        int y;
        int sum;

        System.out.print("Enter x = ");
        x = input.nextInt();
        System.out.print("Enter y =");
        y = input.nextInt();

        sum =x+y;



        System.out.print("Sum of x+y="+sum);
    }
    
}
