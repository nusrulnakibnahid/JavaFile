package BasicJava.Number_System_Conversion;

import java.util.Scanner;

//Decimal To Binary, octal, hexadecimal
public class NCDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // decimal to binary
        int decimal;
        System.out.print("Enter a decimal number:");
        decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal to binary:" + binary);

        // decimal to octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Decimal to octal:" + octal);

        // decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Decimal to octal:" + octal);

    }
}
