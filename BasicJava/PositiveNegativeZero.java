package BasicJava;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter an integer number: ");
        num = input.nextInt();

        if(num>0) {
            System.out.print("Positive number");
        }
        else if(num<0){
            System.out.print("Negative number");
        } 

        else{
            System.out.print("Number is zero");
        }
    }
}
