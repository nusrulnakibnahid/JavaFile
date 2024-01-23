package Revision;

import java.util.Scanner;

public class ForLoopex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int x,y ,sum=0;

        System.out.print("Enter first number:");
        x = input.nextInt(); 

        System.out.print("Enter second number:");
        y = input.nextInt(); 

        for (int i=x; i<=y; i++) {
            sum+=i;
        }

        System.out.println("Total: "+sum);
    }
}
