package BasicJava;

import java.util.Scanner;

//print sum of all odd numbers from m to n (use do-while loop)
public class DoWhileLoop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int m,n, sum = 0;
        System.out.print("Enter m:");
        m = input.nextInt();
        System.out.print("Enter n:");
        n = input.nextInt();

        int i = m;

        do {
            if(i % 2!= 0){
                sum = sum +i;
                System.out.println(+i);
            }
            i++;
        } while(i<=n);

        System.out.println("Sum of all odd numbers: "+sum);
        
    }
    
}
