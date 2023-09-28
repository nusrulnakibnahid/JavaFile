package Assignment;

import java.util.Scanner;
/*
 * Digit spelling program using if,else if, else
 * step 1: ask for a digit between 0-9
 * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
 * step 3: if the digit is not among 0-9 then print Invalid digit
 */
public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter any number(0-9):");
        num = input.nextInt();

        if(num == 0) {
            System.out.print("Zero");
        }

        else if(num == 1) {
            System.out.print("One");
        }

        else if(num == 2) {
            System.out.print("Two");
        }

        else if(num == 3) {
            System.out.print("Three");
        }

        else if(num == 4) {
            System.out.print("Four");
        }

        else if(num == 5) {
            System.out.print("Five");
        }

        else if(num == 6) {
            System.out.print("Six");
        }

        else if(num == 7) {
            System.out.print("Seven");
        }

        else if(num == 8) {
            System.out.print("Eight");
        }
        else if(num == 9) {
            System.out.print("Nine");
        }
        else {
            System.out.print("Invalied Digit");
        }

    }
}
