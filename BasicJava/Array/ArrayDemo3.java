package BasicJava.Array;

import java.util.Scanner;
//Array ( finding sum and average by using for loop )
public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        double avg;

        System.out.print("Please enter 5 numbers:");
        
        //Total numberes user wants
        for(int i = 0; i< number.length; i++){
            number[i] = input.nextDouble();
        }
        

        //total sum
        for(int i = 0; i< number.length; i++){
            sum = sum + number[i];
        }

        System.out.println("Total sum: "+sum);
        
        //Average of sum
        avg = sum / number.length;
        System.out.print("Average is:"+avg);

        
    }
    
}
