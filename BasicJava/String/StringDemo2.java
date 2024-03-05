package BasicJava.String;

public class StringDemo2 {
    public static void main(String[] args) {
        String FirstName = "Nusrul Nakib";
        String LastName = " Nahid";

        // using concat methods
        String FullName = FirstName.concat(LastName);
        System.out.println("Full name: " + FullName);

        // upper case
        String UpperName = FullName.toUpperCase();
        System.out.println("Upper Case Name: " + UpperName);

        // lower case
        String LowerName = FullName.toLowerCase();
        System.out.println("Lower Case Name: " + LowerName);

        // stars with
        boolean stars = FirstName.startsWith("N");
        System.out.println("Is that starts with 'N': " + stars);

        // ends with
        boolean ends = FullName.endsWith("Nahid");
        System.out.println("Is that ends with 'Nahid': " + ends);

    }
}
