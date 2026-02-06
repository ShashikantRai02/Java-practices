package Whileloop;

public class Lab37IQ {
    public static void main(String[] args) {
        //write a program for factorial of a number
        int num = 5; // number to find factorial of
        int factorial = 1; // variable to store factorial result
        int i = 1; // initialization
        while (i <= num) // condition
        {
            factorial *= i; // multiply factorial by current number
            System.out.println("Factorial of " + num + " at step " + i + " is: " + factorial); // print current factorial
            i++; // increment
        }
    }
}
