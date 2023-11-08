package BasicJava;

import java.util.Scanner;

public class TimeTableDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m,n;
        System.out.print("Enter first number:");
        m = input.nextInt();
        System.out.print("Enter last number:");
        n = input.nextInt();

        for (int i =m; i<=n; i++){
            for (int j =1; j<=10; j++){ //nested for loop
                
                System.out.println(i+ "X"+j+ "=" +i*j);
            }
            System.out.println("\n \n"); //for new line

        }

    }

}