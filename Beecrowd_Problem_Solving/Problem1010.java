package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*In this problem, the task is to read a code of a product 1,
the number of units of product 1, the price for one unit of product 1,
the code of a product 2, the number of units of product 2 and the price
for one unit of product 2. After this, calculate and show the amount to be paid. */
public class Problem1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int unit,code,prodect1,prodect2;
        double price1,price2,total;

        //Input product1 
        System.out.print("Number of code product1: "); 
        code = input.nextInt();
        System.out.print("Number of unit product1: ");
        unit = input.nextInt(); 
        System.out.print("Enter the price for one unit of product 1: ");
        price1 = input.nextDouble();

        //Input product 2
        System.out.print("Number of code product2: "); 
        code = input.nextInt();
        System.out.print("Number of unit product2: ");
        unit = input.nextInt(); 
        System.out.print("Enter the price for one unit of product 2: ");
        price2 = input.nextDouble();

        total = (unit*price1) + (unit*price2);
        System.out.print("Total amount to be paid($): " +total);


    }
}
