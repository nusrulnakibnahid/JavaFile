package OOP.Constructor;

public class Student1 {
    String name, gender;
    int id;

    Student1(String n, String g, int i) {
        name = n;
        gender = g;
        id = i;

    }

    void displayInfomation() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Gende " + gender);
        System.out.println("Student ID: " + id);
    }

}
