package Control_Statement;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter any integer number: ");
        num = input.nextInt();

        if(num>0){

            System.out.print("Number is Positive");
        }
    }
}