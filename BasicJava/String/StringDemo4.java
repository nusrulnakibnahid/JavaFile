package BasicJava.String;

public class StringDemo4 {
    public static void main(String[] args) {

        String s1 = "Thjs js my country";
        System.out.println("Before replace= " + s1);

        // replace method
        String s2 = s1.replace('j', 'i');
        System.out.println("After replace =" + s2);

        
        // split method
        String[] s3 = s2.split(" ");

        System.out.println("After split:");
        for (String x : s3) {
            System.out.println(x);
        }
    }
}
