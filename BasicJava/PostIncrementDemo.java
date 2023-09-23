package BasicJava;

public class PostIncrementDemo {
    public static void main(String[] args) {
        
        int x =25;
        int y;

        y = x++; //postfix increment
        System.out.println("y : "+y);

        y = x;
        System.out.print("Postfix Increment(y): "+y);


    }
}
