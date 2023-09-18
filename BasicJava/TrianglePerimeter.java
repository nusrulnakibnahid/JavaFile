package BasicJava;

import java.util.Scanner;
//Perimeter of a Triangle
public class TrianglePerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b,c,triangle; //a, b and c being the side lengths

        System.out.print("Enter a: ");
        a = input.nextDouble(); 

        System.out.print("Enter b: "); 
        b = input.nextDouble(); 

        System.out.print("Enter c: "); 
        c = input.nextDouble();  

        triangle = a + b + c;   //Formula (Triangle	a + b + c)

        System.out.print("Perimeter of a triangle is : "  +triangle);

    }
}