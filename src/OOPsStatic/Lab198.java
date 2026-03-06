package OOPsStatic;

public class Lab198 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student1 s3 = new Student1();

        Student1.displayCount(); // Display the total number of students
    }
}
class Student1{
    static int count = 0; // Static variable to keep track of the number of students

    public Student1() {
        count++; // Increment the count whenever a new student is created
    }

    public static void displayCount() {
        System.out.println("Total number of students: " + count);
    }
}
