package Ifcondition;

public class Lab50 {
    public static void main(String[] args) {
        //Scanner class is used to take input from user
        java.util.Scanner sc = new java.util.Scanner(System.in);// create scanner object
        System.out.println("Enter a number:");// prompt user to enter a number
        int num = sc.nextInt(); // take input from user
        if (num % 2 == 0) { // check if the number is even
            System.out.println(num + " is an even number."); // print if it is even
        } else { // if the number is not even, then it must be odd
            System.out.println(num + " is an odd number."); // print if it is odd
        }
    }
}
