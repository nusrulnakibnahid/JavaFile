package Practice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        System.out.print("Enter number a: " );
        a = input.nextInt();

        System.out.print("Enter b: " );
        b = input.nextInt();

        if (a>b){
            System.out.println("a is greatest number ");
        }

        else if (b>a){
            System.out.println("b is greatest number");
        }

        else{
            System.out.println("Both are equal number");
        }

    }
}
