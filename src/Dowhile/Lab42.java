package Dowhile;

public class Lab42 {
    public static void main(String[] args) {
        // Write a program to calculate the sum of first 10 natural numbers using do-while loop
        int i = 1; // initialization
        int sum = 0; // variable to store the sum
        do {
            sum += i; // add current number to sum
            i++; // increment
        } while (i <= 10); // condition
        System.out.println("The sum of the first 10 natural numbers is: " + sum); // print the result
    }
}
