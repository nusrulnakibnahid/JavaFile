package OOP.Method;

public class Test1 {
    public static void main(String[] args) {
        Teacher1 teacher1, teacher2;// object declare
        teacher1 = new Teacher1();// create

        teacher1.name = "Md.Rajib Mia";
        teacher1.gender = "Male";
        teacher1.phone = 1234567;
        teacher1.displayInformation();

        teacher2 = new Teacher1();// create
        teacher2.name = "Md.Mujib";
        teacher2.gender = "Male";
        teacher2.phone = 1234567;
        teacher2.displayInformation();


    }
    
}
