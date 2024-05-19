package OOP.Introdruction_OOP;

//class & objects
public class Test {

    public static void main(String[] args) {
        Teacher teacher1, teacher2;// object declare
        teacher1 = new Teacher();// create

        teacher1.name = "Md.Rajib Mia";  
        teacher1.gender = "Male";
        teacher1.phone = 1234567;

        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone);

        teacher2 = new Teacher();// create

        teacher2.name = "Md.Mujib";
        teacher2.gender = "Male";
        teacher2.phone = 1234567;

        System.out.println("Name: " + teacher2.name);
        System.out.println("Gender: " + teacher2.gender);
        System.out.println("Phone: " + teacher2.phone);

    }

}
