package Assignment;

import java.util.Scanner;
//1^2+2^2+3^2+4^2+........+n = ?
public class Series4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,sum=0;
        System.out.print("Enter the last number(n):");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(+i );
            sum = sum + i*i;
            
        }
        System.out.println("Sum:"+sum);
        
    }
}
