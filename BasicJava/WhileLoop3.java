package BasicJava;

import java.util.Scanner;

//print sum of all even numbers from m to n(while loop)
public class WhileLoop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n, sum = 0;
        System.out.print("Enter m:");
        m = input.nextInt();
        System.out.print("Enter n:");
        n = input.nextInt();

        int i = m;
        while (i<=n){

            if(i%2==0){
                sum = sum+i;
            }
            i++;
        }
          System.out.println("Sum of all even numbers: "+sum); 
    }
}
