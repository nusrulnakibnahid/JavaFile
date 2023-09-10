package Practice;

import java.util.Scanner;

public class Practice3 {

    //Write a program to take two integer inputs from user and print mul and product of them.
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b,mul;

        System.out.print("Enter number a= ");
        a= input.nextInt();
        System.out.print("Enter number b= ");
        b= input.nextInt();

        mul=a*b;

        System.out.print("Multiplication of ab = "+mul);


        
    }
}
