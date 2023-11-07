package BasicJava;

import java.util.Scanner;
//print sum of all numbers from m to n (use for loop)
public class ForLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int m,n, sum = 0;
        System.out.print("Enter m:");
        m = input.nextInt();
        System.out.print("Enter n:");
        n = input.nextInt();

        for(int i = m; i<=n; i++) {
            sum = sum +i;
            System.out.println(+i);
        }
        System.out.println("Sum:"+sum);
    }
    
}
