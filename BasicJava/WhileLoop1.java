package BasicJava;
//print sum of all the numbers from 1-10(using while loop)

public class WhileLoop1 {
    public static void main(String[] args) {

        int sum = 0;

        int i =1;
        while(i<=10){
            sum = sum + i;
            i++;
        }
            System.out.println("Sum of all numbers from 1-10:"+sum);
        
    }
}
