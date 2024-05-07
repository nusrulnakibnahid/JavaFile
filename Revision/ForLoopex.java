package Revision;

import java.util.Scanner;

public class ForLoopex {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter number of terms: ");
         n = input.nextInt(); 

        for(int i=1; i<=n; i++) { 
            sum=sum+i; 
        }

        System.out.println("Total: " + sum);
    }
}
