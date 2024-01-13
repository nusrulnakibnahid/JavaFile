package Revision;

import java.util.Scanner;

public class UnaryPlusMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int x,result; 
        System.out.print("Enter the number:");
        x = input.nextInt();

        result = +x; 
        System.out.println("Result in unary Plus: "+result); 

        result = -x; 
        System.out.println("Result in unary Minus: "+result); 
        


    }
}
