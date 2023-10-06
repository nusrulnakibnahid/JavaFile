package Practice;

import java.util.Scanner;
//Write a program to input angles of a triangle and check whether triangle is valid or not
public class TriangleValidOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c,sum; //a,b,c are angle of a tringle 


        System.out.print("Enter the angle a: ");
        a = input.nextInt();
        System.out.print("Enter the angle b: ");
        b =  input.nextInt();
        System.out.print("Enter the angle c: ");
        c = input.nextInt();

        sum =  a+b+c;
        System.out.println("Sum of a,b & c: "+sum);

        if(sum==180 && a>0 && b>0 && c>0 ){

            System.out.print("Tringle is valid");
        }

        else {
            System.out.print("Tringle is  invalid");
        }
    }
}
