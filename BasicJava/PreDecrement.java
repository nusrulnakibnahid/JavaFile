package BasicJava;

public class PreDecrement {
    public static void main(String[] args) {
        int a = 25;
        int b;

        b = --a; //Prefix decrement ,Here output show(b = 24)
        System.out.println("b = " +b);

        b = a; //Output show same (b = 24)
        System.out.print("Pre Decrement is(b):"+b);
    }
}
