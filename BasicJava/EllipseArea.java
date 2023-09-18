package BasicJava;

import java.util.Scanner;
//Area of Ellipse
public class EllipseArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x,y,area;  /*x= radius of the major axis, y= radius of the minor axis */

        System.out.print("Enter x = ");
        x = input.nextDouble();

        System.out.print("Enter y = ");
        y = input.nextDouble();


        area = 3.1416 * x * y;  // Formula Area of Ellipse = pi * a * b 

        System.out.print("Area of Ellipse is : " +area );

    }
}
