package Beecrowd_Problem_Solving;

import java.util.Scanner;
//Calculate a car's average consumption being provided the total distance traveled (in Km) and the spent fuel total (in liters)
public class Problem1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,average; //a=total distance traveled,b=spent fuel
        System.out.print("Total distance traveled: ");
        a = input.nextDouble();
       System.out.print("Spent fuel(L): ");//L= liters
       b = input.nextDouble();

       average = a/b ;

       System.out.printf("car's average consumption:%.2f km/l\n", +average);


    }
}
