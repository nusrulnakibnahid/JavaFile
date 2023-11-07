package BasicJava;

import java.util.Scanner;

//print sum of all the numbers from m to n(while loop)
public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m,n, sum = 0;
        System.out.print("Enter m:");
        m = input.nextInt();
        System.out.print("Enter n:");
        n = input.nextInt();

        int i = m; 
        while(i<=n){
            sum =sum +i;
            i++;
        }
        System.out.print("Sum:"+sum);
    }
    
}
