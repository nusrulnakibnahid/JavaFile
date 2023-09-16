package BasicJava;

import java.util.Scanner;
//Celsius to Fahrenheit
public class CelsiusDemo {
    public static void main(String[] args) {
        Scanner input =   new Scanner(System.in);

        double celsius, fahrenheit;
        System.out.print("Enter Temperature(celsius): ");
        celsius = input.nextDouble();

        fahrenheit= 9/5 *celsius + 32;

        System.out.print("Temperature in fahrenheit:"+fahrenheit);
        
    }
}
