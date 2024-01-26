package Revision;

import java.util.Scanner;

public class SeriesEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int n,sum=0;
        System.out.print("Enter last number:");
        n = input.nextInt(); 

        for(int i=2; i<=n; i=i+2){
            System.out.print(i+ " ");
            sum = sum + i; 
        }

        System.out.println();
        System.out.print("Total:"+sum);
    }
}
