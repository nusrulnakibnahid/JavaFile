package Practice;

import java.util.Scanner;
//Smallest Number
public class SmallestValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x,y,z,Smallest;

        System.out.print("Enter Number x: ");
        x = input.nextDouble(); 

        System.out.print("Enter Number y: "); 
        y = input.nextDouble();  

        System.out.print("Enter Number z: ");  
        z = input.nextDouble();  


        Smallest = Math.min(Math.min(x, y), z);

        System.out.println("Smallest Number Is: "+Smallest);  



    }
}
