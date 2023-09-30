package BasicJava;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        System.out.print("Enter year: ");
        year = input.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.print("Leep year");
        }

        else{
            System.out.print("Not leap year");
        }
    }
}
