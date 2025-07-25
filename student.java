// constructor overloading in java happens when we have same constructor under a class with same name but different parameters
// just make sure to make two objects for two different constructors
public class student {
    int id;
    String name;

    student() {
        System.out.println("this is default constructor");

    }

    student(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        student sc = new student();
        System.out.println("student id:" + sc.id + " " + "studen name:" + sc.name);

        student s = new student(10, "Ankit");
        System.out.println("this is for parameterized constructor");
        System.out.println("student id:" + s.id + " " + "student name:" + s.name);

    }
}
