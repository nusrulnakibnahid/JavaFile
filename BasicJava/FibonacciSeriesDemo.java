package BasicJava;

import java.util.Scanner;

public class FibonacciSeriesDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,first=0,second=1,fibo; 
        System.out.print("How many numbers: ");
        n = input.nextInt();
        System.out.print(first+ " " + second);

        for (int i = 3; i <= n; i++){  //i = 3 because first and second number are already printed 

            fibo = first + second;
            System.out.print(" " +fibo);
            first = second;
            second = fibo;

        }


    }
}
