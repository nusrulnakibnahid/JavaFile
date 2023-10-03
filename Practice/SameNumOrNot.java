package Practice;

import java.util.Scanner;
//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places
public class SameNumOrNot {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        float a,b;
        System.out.print("Enter number a: ");
        a = input.nextFloat();

        System.out.print("Enter number b: ");
        b = input.nextFloat();

        a = Math.round(a*1000);
        a = a/1000;

        b = Math.round(b*1000);
        b = b/1000;

        if(a == b){
            System.out.println("They are equal");
        }

        else{
            System.out.println("They are different");
        }

    }
}
