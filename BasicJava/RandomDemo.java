package BasicJava;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        
        Random random = new Random();

        int randomnumber = random.nextInt(10);
        System.out.println("Random Number: "+randomnumber);
    }
    
}
