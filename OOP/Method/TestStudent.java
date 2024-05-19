package OOP.Method;

public class TestStudent {
    public static void main(String[] args) {
        Student student1,student2;


        student1 = new Student();
        student1.setInformation("Nusrul Nakib", "male", 01);
        student1.displayInformation();


        student2 = new Student();
        student2.setInformation("Nahid","male", 02);
        student2.displayInformation();


    }
}
