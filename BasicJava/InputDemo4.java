package BasicJava;

import java.util.Scanner;

public class InputDemo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number;

        System.out.print("Enter any number = ");
        number = input.nextDouble(); 

        System.out.print("Number is = "+number);
    }
    
}
