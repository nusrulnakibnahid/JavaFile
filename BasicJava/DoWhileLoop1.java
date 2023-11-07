package BasicJava;
//print sum of all the numbers from 1-10(using do-while loop)
public class DoWhileLoop1 {
    public static void main(String[] args) {
        int sum = 0;

        int  i = 1;
        do {
            sum =sum + i;
            i++;
        } while(i<=10);

        System.out.println("Sum of all numbers from 1-10:"+sum);
        
    }
    
}
