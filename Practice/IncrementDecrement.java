package Practice;

public class IncrementDecrement {
    public static void main(String[] args) {
        
        int x = 30;
        int y;

        y = ++x; //Prefix increment,Here output shows(y=31)
        System.out.println("y = " +y);

        y = x; //Shows same output (x=31)
        System.out.println("Pre increment is (y) = " + y);

        y = x++; //Postfix increment, Here output shows (y=31)
        System.out.println("y = " +y);

        y = x; //Here output shows (y =32)
        System.out.println("Post increment is (y) = " +y);


        y =  --x; //Prefix decrement,Here output shows (y =31)
        System.out.println("y = " +y);

        y = x;//Hrere shows same output (y = 31)
        System.out.println("Pre Decrement Is (y) = " +y);

        y =x--;//Postfix decrement,Here output shows (y = 31)
        System.out.println("y = " +y);

        y = x; //Here output shows (y = 30)
        System.out.println("Pre Decrement Is (y) = " +y);
    }
}
