package Practice;

import java.util.Scanner;
// Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name
public class WeekdayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter an integer number between 1-7:");
        num = input.nextInt();

        if(num == 1) {
            System.out.println("It's Saturday"); //Saturday is number 1
        }
        else if(num == 2) {
            System.out.println("It's Sunday");//Sunday is number 2
        }

        else if(num == 3) {
            System.out.println("It's Monday");//Monday is number 3
        }

        else if(num == 4) {
            System.out.println("It's Tuesday");//Tuesday is number 4
        }

        else if(num == 5) {
            System.out.println("It's Wednesday");//Wednesday is number 5 
        }

        else if(num == 6) {
            System.out.println("It's Thursday");//Thursday is number 6
        }

        else if(num == 7) {
            System.out.println("It's Friday");//Friday is number 7
        }

        else {
            System.out.println("Invalid number");
        }
         
    }
}
