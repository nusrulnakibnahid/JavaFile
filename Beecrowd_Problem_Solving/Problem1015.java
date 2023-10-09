package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Read the four values corresponding to the x and y axes of two points in the plane,
p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them, showing four 
decimal places after the comma, according to the formula:

Distance =  √(x2-x1)^2 + (y2-y1)^2*/
public class Problem1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1,x2,y1,y2,distance;
        System.out.print("Enter x1: ");
        x1 = input.nextDouble();
        System.out.print("Enter x2: ");
        x2 = input.nextDouble();
        System.out.print("Enter y1: ");
        y1 = input.nextDouble();
        System.out.print("Enter y2: ");
        y2 = input.nextDouble();
        
        distance =  Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.printf("Distance:%.4f ",+distance);



    }
}
