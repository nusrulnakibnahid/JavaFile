package Revision;

import java.util.Scanner;

public class SubEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, sub;
        System.out.print("Enetr number:");
        a = input.nextInt();

        System.out.print("Enter number:");
        b = input.nextInt();

        sub =a - b;
        System.out.println("sub = " + sub);

    }

}
