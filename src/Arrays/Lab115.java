package Arrays;

import java.util.Scanner;

public class Lab115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array(integer): ");
        int size = scanner.nextInt();//taking size of the array from user
        String[]marks = new String[size];//creating an array of strings with the specified size
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            marks[i] = scanner.next();//taking input for each element of the array
        }
    }
}
