package Revision;

import java.util.Scanner;

public class IfElseElseIfLadder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter any integer number: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        }

        else if (num == 0) {
            System.out.println("Number is 0");
        }

        else {
            System.out.println("Negative number");
        }
    }

}