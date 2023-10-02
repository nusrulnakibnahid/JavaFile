package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Make a program that calculates and shows the volume of a sphere being
provided the value of its radius (R) . The formula to calculate the
volume is: (4/3) * pi * R3. Consider (assign) for pi the value 3.14159. */

public class Problem1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double R,volume; //R =radius 
        System.out.print("Enter the radius: ");
        R = input.nextDouble();


        volume = ((4/3) * 3.1416 *(R*R*R)); //pi=3.1416
        System.out.print("Volume is: "+volume);
    }
}
