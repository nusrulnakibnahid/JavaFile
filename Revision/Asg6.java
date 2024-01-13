package Revision;

import java.util.Scanner;
/*
 * Digit spelling program using if,else if, else
 * step 1: ask for a digit between 0-9
 * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
 * step 3: if the digit is not among 0-9 then print Invalid digit
 */
public class Asg6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int num;
        System.out.print("Enter a number between(0-9): ");
        num = input.nextInt(); 

        if (num == 0){
            System.out.println("Number is 0");
        }

        else if (num == 1){
            System.out.println("Valid digit");
        }  

        else if (num == 2){
            System.out.println("Valid digit");
        }  

        else if (num == 3){
            System.out.println("Valid digit");
        }  
        else if (num == 4){
            System.out.println("Valid digit");
        }  
        
        else if (num == 5){
            System.out.println("Valid digit");
        }

        else if (num == 6){
            System.out.println("Valid digit");
        }

        else if (num == 7){
            System.out.println("Valid digit");
        }

        else if (num == 8){
            System.out.println("Valid digit");
        }

        else if (num == 9){

            System.out.println("Valid digit");
        }

        else {
            System.out.println("Invalid digit");
        }

    }
}
