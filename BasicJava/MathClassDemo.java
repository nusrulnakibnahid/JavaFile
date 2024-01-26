package BasicJava;

import java.util.Scanner;
//Find maximum & minimum values by uising Math Class
public class MathClassDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x,y;

        System.out.print("Enter x: ");
        x = input.nextInt();
        System.out.print("Enter y: ");
        y = input.nextInt();
 
        int max = Math.max(x,y);
        int min = Math.min(x,y);

        System.out.println("Maximum: "+max);
        System.out.print("Minimum: "+min);
    }

}
