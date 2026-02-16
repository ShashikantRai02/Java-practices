package Arrays;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt(); // Read the size of the triangle from user input
        //size = 5; // You can also set a default size if you don't want to take input from the user
        for (int i = 1; i <= size; i++) { // Loop through each row
            for (int j = 1; j <= size - i; j++) { // Loop to print spaces before stars
                System.out.print(" ");// Print space
            }
            for (int k = 1; k <= i; k++) { // Loop to print stars in each row
                System.out.print("\uD83D\uDE0A");// Print a smiley face (you can replace it with "*" for a simple star)
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
