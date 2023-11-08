package BasicJava;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num,fact=1;
        System.out.print("Enter a number:");
        num = input.nextInt();

        for (int i = num; i>= 1; i--){
            System.out.println(i);
            fact = fact *i;

        }

        System.out.println("Factorial of "+num+ "=" +fact);  //(+num+), means here show the exact number we put in input 

    }
}
