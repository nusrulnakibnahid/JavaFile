package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B. */
public class Problem1012 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        float A,B,C;
        double triangle,circle,trapezium,square,rectangle;
        System.out.print("Enter value of A: ");
        A = input.nextFloat();
        System.out.print("Enter value of B: ");
        B = input.nextFloat();
        System.out.print("Enter value of C: ");
        C = input.nextFloat();

        triangle = (A*C)/2; //area of the rectangled triangle that has base A and height C
        circle =((C*C)*3.1416);//area of the radius's circle C. (pi = 3.14159)
        trapezium = (((A+B)/2)*C);//area of the trapezium which has A and B by base, and C by height
        square = (B*B);//area of ​​the square that has side B.
        rectangle = A*B;//area of the rectangle that has sides A and B.

        System.out.println("Area of triangle: "+triangle);
        System.out.println("Area of circle: "+circle);
        System.out.println("Area of trapezium: "+triangle);
        System.out.println("Area of square: "+square);
        System.out.print("Area of rectangle: "+rectangle);

    }
}
