package Revision;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        float r;
        double area;

        System.out.print("Enter the radius of the circle: ");
        r = input.nextFloat();

        area = 3.14 * r * r;
System.out.printf("The area of the circle is: %.2f", area);
    }
}
