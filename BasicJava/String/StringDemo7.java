package BasicJava.String;

//StringBuilder Class
public class StringDemo7 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Nusrul");
        System.out.println("str= " + str);

        str.append(" Nakib");
        str.append(" Nahid ");
        str.append(12.4);

        System.out.println("str now: " + str);

        str.reverse();
        System.out.println("str after reverse: " + str);

        str.delete(3, 8);
        System.out.println("str after delete: " + str);

    }
}
