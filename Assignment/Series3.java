package Assignment;

import java.util.Scanner;
//1.5+2.5+3.5+4.5+........+n = ?
public class Series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,sum =0;
        System.out.print("enter the last number(n):");
        n = input.nextDouble();

        for (double i = 1.5; i<=n; i=i+1){
            sum = sum + i;
            System.out.println(+i);

        }
        System.out.println("Sum:"+sum);

    }
}
