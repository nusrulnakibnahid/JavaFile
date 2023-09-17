package BasicJava;

import java.util.Scanner;
//Area of a reactangle
public class RectangleArea {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        double length,width,rectangle;

        System.out.print("Length is:");
        length = input.nextDouble();

        System.out.print("Width is:");
        width = input.nextDouble();

        rectangle = length * width; //formula (rectangle= length*width)

        System.out.print("The area of the rectangle: " +rectangle);

        
    }
}
