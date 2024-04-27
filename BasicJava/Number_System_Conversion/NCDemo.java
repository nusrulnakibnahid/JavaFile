package BasicJava.Number_System_Conversion;

import java.util.Scanner;

//Binary, octal, hexadecimal to Decimal
public class NCDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // binary to decimal
        String binary;
        System.out.print("Enter a binary number:");
        binary = input.next();
        Integer decimal1 = Integer.parseInt(binary, 2);
        System.out.println("Binary to decimal = " + decimal1);

        // octal to decimal
        String octal;
        System.out.print("Enter a octal number:");
        octal = input.next();
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println("Octal to decimal = " + decimal2);

        // hexadecimal to decimal
        String hexadecimal;
        System.out.print("Enter a hexadecimal number:");
        hexadecimal = input.next();
        Integer decimal3 = Integer.parseInt(hexadecimal, 16);
        System.out.println("Hexadecimal to decimal = " + decimal3);

    }

}