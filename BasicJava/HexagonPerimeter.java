package BasicJava;

import java.util.Scanner;

public class HexagonPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        double a,perimeter;

        System.out.print("Enter a: ");
        a = input.nextDouble();


        perimeter = 6 * a;  //formula (Hexagon Perimeter = 6*a )

        System.out.print("Perimeter of hegagon is: "+perimeter);
    }
}
