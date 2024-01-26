package BasicJava;

import java.util.Scanner;

public class KitePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x,y,kite_perimeter;              /*x = Length of the first pair of equal sides
                                                  y = Length of the second pair of equal sides */

        System.out.print("Enter x: " ); 
        x = input.nextDouble(); 
 
        System.out.print("Enter y: " ); 
        y = input.nextDouble();  
        
        kite_perimeter = (2*x) + (2*y);  //Formula (Kite Perimeter=2a + 2b)

        System.out.print("Kite Perimeter is : " +kite_perimeter);
    
    }
}
