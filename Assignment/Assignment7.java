package Assignment;

import java.util.Scanner;
/*Logical or assignment
 step 1: Print "Do you love java? "
 step 2: take user input y / Y / n / N
 step 3: if user input y / Y then print you are a java lover
 step 4: if user input n / N then print you are not a java lover */

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        char ch;
        System.out.println("**Question**\nDo you love java?");
        System.out.print("Enter your answer:");
        ch = input.next().charAt(0);

        if(ch ==  'y' || ch == 'Y') { //y/Y means yes
            System.out.print("You are a java lover");
        }

        else if(ch == 'n' || ch == 'N') { //n/N means no
            System.out.print("You are not a java lover");
        }
        else {
            System.out.print("Wrong answer.please press y/Y or n/N!!");
        }

    }
}