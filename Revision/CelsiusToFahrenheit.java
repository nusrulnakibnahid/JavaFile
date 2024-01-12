package Revision;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        double celsius,fahrenheit;

        System.out.print("Enter temperature(Celsius):");
        celsius = input.nextDouble();


        fahrenheit = 9/5 * celsius + 32;

        System.out.println("Temperature in fahrenheit: " +fahrenheit);
    }
}
