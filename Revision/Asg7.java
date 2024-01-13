package Revision;

import java.util.Scanner;
// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover
public class Asg7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        char c;
        System.out.print("Do you love java?:");
        c = input.next().charAt(0);

        if (c == 'y' || c == 'Y'){
            System.out.println("You are a java lover");
    }

    else if (c == 'n' || c == 'N'){
        System.out.println("You are not a java lover");
    }

    else {
        System.out.println("Invalid input");
    }
}
}
