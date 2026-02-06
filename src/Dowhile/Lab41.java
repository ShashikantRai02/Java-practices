package Dowhile;

public class Lab41 {
    public static void main(String[] args) {
        // Print the multiplication table of a number using do-while loop
        int number = 5; // number for which to print the multiplication table
        int i = 1; // initialization
        System.out.println("Multiplication Table of " + number + ":"); // header for the multiplication table
        do {
            System.out.println(number + " x " + i + " = " + (number * i)); // print the current line of the multiplication table
            i++; // increment
        } while (i <= 10); // condition to print up to 10 times
    }
}
