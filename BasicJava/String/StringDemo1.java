package BasicJava.String;

public class StringDemo1 {
    public static void main(String[] args) {

        String s1 = "Nusrul Nakib Nahid";
        String s2 = new String("nusrul nakib nahid");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // Length
        int len = s1.length();
        System.out.println("s1 length:" + len);

        // Equality
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 & s2 are equals");

        } else {
            System.out.println(" s1 & s2 are not equals");
        }

        // Contains method
        boolean x = s1.contains("Nahid");
        System.out.println(x);

        // Empty
        boolean y = s1.isEmpty();
        System.out.println(y);

    }
}
