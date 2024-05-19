package OOP.Method;

//Parametrised Method in a class
public class Student {
    String name, gender;
    int id;

    void setInformation(String n, String g, int i) {

        name = n;
        gender = g;
        id = i;

    }

    void displayInformation() {
        System.out.println("Teacher name: " + name);
        System.out.println("Gender:" + gender);
        System.out.println("Student ID: " + id);

    }

}
