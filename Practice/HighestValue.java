package Practice;

import java.util.Scanner;
//Highst Value
public class HighestValue {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        double x,y,z,Highest;

        System.out.print("Enter Number x: ");
        x = input.nextDouble(); 

        System.out.print("Enter Number y: "); 
        y = input.nextDouble();  

        System.out.print("Enter Number z: ");  
        z = input.nextDouble();  


        Highest = Math.max(Math.min(x, y), z);

        System.out.println("Highest Number Is: "+Highest);  
    }
}
