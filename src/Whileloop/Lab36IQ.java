package Whileloop;

public class Lab36IQ {
    public static void main(String[] args) {
        //write a program to print the first 10 even numbers using while loop
        int count = 0; // to count the even numbers printed
        int num = 2; // starting from the first even number
        while (count < 10) // loop until we have printed 10 even numbers
        {
            System.out.println(num); // print the current even number
            num += 2; // move to the next even number
            count++; // increment the count of even numbers printed
        }
    }
}
