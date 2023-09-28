package BasicJava;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter any positive integer number: ");
        num = input.nextInt();


        if(num%2==0){
            System.out.print("Number is even ");
        }

        else{
            System.out.print("Number is odd ");
        }
    }
}
