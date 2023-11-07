package BasicJava;
//print sum of all even numbers from m to n(use do-while loop)

import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int m,n, sum = 0;
        System.out.print("Enter m:");
        m = input.nextInt();
        System.out.print("Enter n:");
        n = input.nextInt();

        int i = m;
        do {
            if(i%2==0){
                sum =sum+i;
                System.out.println(+i);
            }
            i++;
        } while(i<=n);

        System.out.println("Sum of all even numbers:"+sum);
        


    }
    
    
}
