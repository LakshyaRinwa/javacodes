public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("John", 1, 85);
        students[1] = new Student("Jane", 2, 90);
        students[2] = new Student("Joe", 3, 78);

        System.out.println("Output: Details of students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", RollNumber: " + student.getRollNumber() + ", Marks: " + student.getMarks());
        }
    }
}