package Practice;

import java.util.Scanner;
//Find the absolute value of a number entered through the keyboard
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");  
        num = input.nextInt();

        num = (-1)*num;

        if(num<0) {
            System.out.println("Absolute number");
        }

        else {
            System.out.print("Not Absolute number");
        }



    }
}
