import java.util.*;

class Person {
    private String name;
    private int age;
    private String gender;

    public void setValue(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }

    public void getValue() {
        System.out.println(name + " " + age + " " + gender);
    }
}

class Student extends Person {
    private int stuId;
    private int marks;
    private String course;

    public void setValue(String n, int a, String g, String c, int s, int m) {
        super.setValue(n, a, g);
        stuId = s;
        marks = m;
        course = c;
    }

    public void getValue() {
        super.getValue();
        System.out.println(stuId + " " + marks + " " + course);
    }
}

class Teacher extends Person {
    private int tId;
    private int salary;
    private int experience;

    public void setValue(String n, int a, String g, int t, int s, int ex) {
        super.setValue(n, a, g);
        tId = t;
        salary = s;
        experience = ex;
    }

    public void getValue() {
        super.getValue();
        System.out.println(tId + " " + salary + " " + experience);
    }
}

public class MainStu {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setValue("Lakshya", 20, "male", "CSE", 1, 80);
        s1.getValue();

        Teacher t1 = new Teacher();
        t1.setValue("Sahil", 28, "male", 101, 50000, 5);
        t1.getValue();
    }
}
