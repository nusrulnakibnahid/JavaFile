package OOP;

//class & objects
public class Test {

    public static void main(String[] args) {
        Teacher teacher1;// object declare
        teacher1 = new Teacher();// create

        teacher1.name = "Md.Rajib Mia";
        teacher1.gender = "Male";
        teacher1.phone = 1234567;

        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone);

    }

}
