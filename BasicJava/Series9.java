package BasicJava;

import java.util.Scanner;
//1^2*2^2*3^2*.......*n = ???
public class Series9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n , mul = 1;
        System.out.print("Enter last number(n):");
        n = input.nextInt();
        

        //use while loop here (we can also use for loop or do-while loop)
        int i = 1;
        while(i<=n){
            mul = mul * (i*i);
            System.out.println("" +i);
            i++;
        }

        System.out.println();
        System.out.println("Answer:"+mul);

    }
}