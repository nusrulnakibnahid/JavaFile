package Assignment;

import java.util.Scanner;
// find factorial of n
public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,factorial=1,number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (i=1; i<=number; i++) {

            factorial = factorial*i; 
        }
        System.out.print("Factorial is: "+factorial);
    }
}
