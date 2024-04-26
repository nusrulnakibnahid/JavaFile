package BasicJava.String;

public class StringDemo5 {
    public static void main(String[] args) {
        
        //buffer method
        StringBuffer sb = new StringBuffer("Nusrul Nakib");
        System.out.println(sb);

        //append method
        sb.append(" Nahid ");
        sb.append(  23);
        System.out.println(sb);

        //reverse method
        sb.reverse();
        System.out.println(sb);

        //delete method
        sb.delete(0, 6);
        System.out.println(sb);

        //set length method 
        sb.setLength(4);
        System.out.println(sb);
    }
}
