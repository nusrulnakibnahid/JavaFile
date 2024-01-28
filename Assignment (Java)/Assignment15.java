package Assignment;

import java.util.Scanner;
// 1. generate and print armstrong numbers from m-n 
// 2. count and print number of armstrong numbers
public class Assignment15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;
        System.out.print("Enter first number:");
        m = input.nextInt();
        System.out.print("Enter last number:");
        n = input.nextInt();

        int totalarmstrongnumber = 0;

        for (int i = m; i <= n; i++) {
            int r, sum = 0;
            int temp = i;
            while (temp != 0) {

                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;

            }
            if (sum == i) {
                System.out.println("" + sum);
                totalarmstrongnumber++;
            }

        }

        System.out.print("Total armstrong number: " + totalarmstrongnumber);

    }
}
