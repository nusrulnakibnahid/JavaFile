package Assignment;

import java.util.Scanner;
// print sum of odd numbers from m-n
public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m,n,sum=0;
        System.out.print("Enter m:");
        m = input.nextInt();
        System.out.print("Enter n:");
        n = input.nextInt();

        for(int i=m; i<=n; i=i+2) {
            System.out.println(i);
            sum = sum+i;
        }
        
        System.out.print("Sum:"+sum);

    }
}
