package BasicJava;

import java.util.Scanner;

public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int a,b,c;

        System.out.print("Enter a:");
        a = input.nextInt();
        System.out.print("Enter b:");
        b = input.nextInt();


        c = a & b;
        System.out.println("a&b:"+c);

        c  = a | b;
        System.out.println("a|b:"+c);

        c  = a ^ b;
        System.out.println("a^b:"+c);

    }
}
