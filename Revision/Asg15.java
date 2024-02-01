package Revision;

import java.util.Scanner;

public class Asg15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int m,n,sum=0,totalarmstrongnum=0,temp,r;

        System.out.print("Enter first number:");
        m = input.nextInt(); 
        System.out.print("Enter last number:");
        n = input.nextInt();

        for(int i=m; i<=n; i++){
            sum = 0;
            temp = i;

            while (temp != 0) {

                r = temp%10;
                sum = sum + r*r*r;
                temp = temp/10;
                
            }
            if (sum == i) {
                System.out.println(" "+sum);
                totalarmstrongnum++;
                
            } 

            
        }
        System.out.println("Total numbers: "+totalarmstrongnum);



    }
}
