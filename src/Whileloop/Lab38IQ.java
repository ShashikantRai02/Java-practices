package Whileloop;

public class Lab38IQ {
    //write a program for factorial of a number using scanner class
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // create a Scanner object to read input
        System.out.print("Enter a number to find its factorial: "); // prompt the user for input
        int num = scanner.nextInt(); // read the number from user input
        int factorial = 1; // variable to store factorial result
        int i = 1; // initialization
        while (i <= num) // condition
        {
            factorial *= i; // multiply factorial by current number
            System.out.println("Factorial of " + num + " at step " + i + " is: " + factorial); // print current factorial
            i++; // increment
        }
        scanner.close(); // close the scanner to prevent resource leaks
    }
}
