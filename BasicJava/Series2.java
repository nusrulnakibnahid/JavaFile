package BasicJava;

import java.util.Scanner;
//2+4+6+8+........+n = ?
public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int n,sum=0;

        System.out.print("Enter the last number(n):");
        n = input.nextInt();
        
        for(int i = 2; i<=n; i= i+2){
            sum = sum+i;
            System.out.println(+i);
        }
        System.out.println("Sum:"+sum);

        
    }
}
