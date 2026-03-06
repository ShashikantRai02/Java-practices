package OOPsStatic;

public class Lab199 {
    public static void main(String[] args) {
        student s1 = new student(20);
        student s2 = new student(22);
        student s3 = new student(18);

        System.out.println("Student 1 Age: " + s1.age);
        System.out.println("Student 2 Age: " + s2.age);
        System.out.println("Student 3 Age: " + s3.age);

        // Accessing static variable and method
        System.out.println("School Name (accessed via class): " + student.schoolName);
        student.displaySchoolName();
    }
}
class student{
    int age;// Instance variable unique to each student
    static String schoolName = "ABC School"; // Static variable shared by all instances
    public student(int age) {
        this.age = age;
    }
    static void displaySchoolName() {
        System.out.println("School Name: " + schoolName);
    }
}
