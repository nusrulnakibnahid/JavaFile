package BasicJava;

import java.util.Scanner;

public class MathClassDemo2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double x;   //also print round value of x
        double y;   //also print absolute value of y
        System.out.print("Enter x: "); 
        x = input.nextDouble();
        System.out.print("Enter y: ");
        y = input.nextDouble();

        double absolute = Math.abs(y);
        double max = Math.max(x,y);
        double min = Math.min(x,y);
        double power = Math.pow(x,y);
        double round = Math.round(x);
        double pi = Math.PI;
        System.out.println("Maximum: " +max );
        System.out.println("Minimum: " +min);
        System.out.println("Absolute value of y: " +absolute);
        System.out.println("x to the power of y: " +power);
        System.out.print("Round value of x: " +round);
        System.out.print("pi = "+pi);

    }

}
