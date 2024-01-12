package Revision;

import java.util.Scanner;

public class AreaTringle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        double area;

        System.out.print("Enter the length of side a: ");
        a = input.nextInt();

        System.out.print("Enter the length of side b: ");
        b = input.nextInt();

        area = 0.5 * (a * b);
        System.out.print("The area of the triangle is: " + area);
    }
}
