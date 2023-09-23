package BasicJava;

public class PostDecrement {
    public static void main(String[] args) {
        
        int a = 25;
        int b;

        b = a--; //Postfix Decrement, Here output show (b =25)
        System.out.println("b = " +b);

        b = a; //here output show (b = 24)
        System.out.print("Post Decrement Is(b)= "+b);
    }
}
