package Revision;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.print("Enter any digit(1-3):");
        a = input.nextInt();

        switch (a) {

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Invalid digit");
        }
    }

}