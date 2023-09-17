package BasicJava;

import java.util.Scanner;
//Area of a Trapezoid
public class TrapezoidArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double a,b,h,trapezoid_area;  /*a=base1,
                        b=base2,
                        h=height*/

        System.out.print("Enter base1: ");
        a=input.nextDouble();

        System.out.print("Enter base2: ");
        b=input.nextDouble(); 

        System.out.print("Enter height:");
        h=input.nextDouble();

        trapezoid_area  = 0.5* (a + b)*h ; //fotrmula Of Trapezoid Area = 1/2 (base1 + base2)height

        System.out.println("Area of Trapezoid: "+trapezoid_area);

    }
}