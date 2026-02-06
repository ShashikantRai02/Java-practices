package Ifcondition;

public class Lab47 {
    public static void main(String[] args) {
        // write a program to find the largest of three numbers
        int a = 10, b = 20, c = 15; // declare and initialize three numbers
        if (a > b && a > c) { // check if a is greater than both b and c
            System.out.println("The largest number is: " + a); // print a if it is the largest
        } else if (b > a && b > c) { // check if b is greater than both a and c
            System.out.println("The largest number is: " + b); // print b if it is the largest
        } else { // if neither a nor b is the largest, then c must be the largest
            System.out.println("The largest number is: " + c); // print c if it is the largest
        }
    }
}
