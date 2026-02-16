package Arrays;

public class Lab106 {
    public static void main(String[] args) {
        int marks[] = {85, 90, 78, 92, 88};
        //2nd way to create the array
        int[] marks2 = new int[5];//1st way to create the array
        int mark3[] = new int[5];//3rd way to create the array fixed size array
        String[] names = new String[5];
        names[0] = "Shashikant";
        names[1] = "Rahul";
        names[2] = "Priya";
        names[3] = "Anjali";
        System.out.println("Marks of student 1: " + marks[0]);
        System.out.println("Marks of student 2: " + marks[1]);
        System.out.println("Marks of student 3: " + marks[2]);
    }
}
