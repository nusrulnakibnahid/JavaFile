package BasicJava;

import java.util.Scanner;
//user input arithmetic demo
public class ArithmeticDemo2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a,b,result;

        System.out.print("Enter num1 = ");
        a = input.nextInt();

        System.out.print("Enter b= ");
        b = input.nextInt();

        result = a + b;
        System.out.println("Summation =  "+result);

        result = a - b;
        System.out.println("Subtraction =  "+result);

        result = a * b;
        System.out.println("Multiplication =  "+result);

        result =  a / b;
        System.out.println("Division =  "+result);

        result = a % b;
        System.out.print("Remainder =  "+result);
 

    }
    
}