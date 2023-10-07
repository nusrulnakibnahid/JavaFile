package Practice;

import java.util.Scanner;
//Write a program to calculate profit or loss
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sp,cp; //sp=selling price, cp=costing price
        int profit,loss;
        System.out.print("Enter selling price: ");
        sp = input.nextInt();
        System.out.print("Enter costing price: ");
        cp = input.nextInt();

        profit = sp-cp;
        loss = cp-sp;

        if(sp>cp){
            System.out.print("Profit");  //or using this line  [System.out.print("Profit"+profit);]
        }
        else if (cp>sp) {
            System.out.print("Loss");
        }

        else {
            System.out.print("No profit,no loss"); //or using this line  [System.out.print("Loss"+loss);]
        }
         
    }
}
