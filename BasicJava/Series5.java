package BasicJava;

import java.util.Scanner;
//1*2*3*4*5*...............*n = ???
public class Series5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, mul =1;
        System.out.print("Enter n:");
        n = input.nextInt();


        for(int i = 1; i<=n; i++) {
            mul = mul * i;
            System.out.print(" "+i );
        }
        System.out.println(); //just for new line

        System.out.print("Answer:"+mul);


    }
}
