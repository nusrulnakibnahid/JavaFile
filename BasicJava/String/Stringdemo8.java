package BasicJava.String;

//Conversion between String and Primitive Data type
public class Stringdemo8 {
    public static void main(String[] args) {

        // premitive -> string
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("S = " + s);

        // string -> premitive data type
        String d = "32";
        int j = Integer.parseInt(d); //or, int j = Integer.valueOf(d);
        System.out.println("d = " + j);

    }
}
