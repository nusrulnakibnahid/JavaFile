package BasicJava;

//Wrapper class (autoboxing, unboxing)

public class WrapperDemo {

    public static void main(String[] args) {

        // premitive -> object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y =  " + x);

        // autoboxing
        Integer z = x; // Integer.valueOf(x)
        System.out.println("z = " + z);

        // object -> premitive data type
        Double d = new Double(10.25);
        System.out.println("d = " + d);

        double e = d.doubleValue(); // or, double e = d;
        System.out.println("e = " + e);

    }

}
