package Beecrowd_Problem_Solving;

import java.util.Scanner;
//Make a program that reads 3 integer values and present the greatest one followed by the message "he's the biggest"
public class Problem1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("Enter a:");
        a = input.nextInt();
        System.out.print("Enter b:");
        b = input.nextInt();
        System.out.print("Enter c:");
        c = input.nextInt();

        if (a>b && a>c){
            System.out.print("a is biggest");
        }

        else if (b>a && b>c){
            System.out.print("b is biggest"); 
        }
        else if (c>a && c>b) {
            System.out.print("c is biggest");
        }
        else {
            System.out.print("a,b,c are equal");
        }
    }
}
