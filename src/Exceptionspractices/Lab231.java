package Exceptionspractices;

import java.util.Scanner;

public class Lab231 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age to join the club: ");
        validate_age_of_club(scanner.nextInt());
         scanner.close();

    }
    static void validate_age_of_club(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be at least 18 to join the club.");
        } else {
            System.out.println("Welcome to the club!");
        }
    }
}
