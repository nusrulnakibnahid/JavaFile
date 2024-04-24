package BasicJava.String;

public class StringDemo3 {
    public static void main(String[] args) {
        String country = "        Bangladesh is my country       ";
        System.out.println(country);

        char ch = country.charAt(0);
        System.out.println("Ch" + ch);

        int value = country.codePointAt(ch);
        System.out.println("value:" + value);

        int pos = country.indexof('n');
        System.out.println("first position of n:" + pos);

        pos = country.lastIndexof('n');
        System.out.println("last position of n:" + pos);

        // remove space(first & last)
        String s3 = country.trim();
        System.out.println(s3);
    }
}
