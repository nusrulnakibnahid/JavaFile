package BasicJava;

import java.util.Scanner;
//Fahrenheit to Celsius
public class FahrenheitDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double celsius,fahrenheit ;
        System.out.print("Enter temperature(fahrenheit): ");
        fahrenheit = input.nextDouble();

        celsius = 0.56 * (fahrenheit - 32); //formula(Celsius=5/9*(fahrenheit-32))

        System.out.print("Temperature in celsius: "+celsius);
    }
    
}
