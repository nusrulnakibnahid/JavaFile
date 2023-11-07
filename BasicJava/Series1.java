package BasicJava;

import java.util.Scanner;
//1+2+3+4+5+..........+n= ?
public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,sum=0;

        System.out.print("Enter the last number(n):");
        n = input.nextInt();

        for (int i = 1; i<=n; i++){
        System.out.println(+i);
        sum = sum + i; 
        
        }
        System.out.println("Sum:"+sum);
    }

}
