package Revision;

import java.util.Scanner;

public class RemainderEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y,remainder;
        System.out.print("Enter first number: ");
        x = input.nextInt(); 
        System.out.print("Enter second number: ");
        y = input.nextInt();

        remainder = x % y;
        System.out.println("Remainder: " + remainder);
    }
}
