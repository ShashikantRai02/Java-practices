package Operator;

public class Lab45 {
    public static void main(String[] args) {
        // write a program to find the sum of first 10 natural numbers
        int sum = 0; // variable to store the sum
        for (int i = 1; i <= 10; i++) { // loop from 1 to 10
            sum += i; // add the current number to the sum
        }
        System.out.println("The sum of the first 10 natural numbers is: " + sum); // print the result
    }
}
