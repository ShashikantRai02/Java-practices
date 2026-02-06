package Whileloop;

public class Lab35IQ {
    public static void main(String[] args) {
        //write the code to print the numbers from 1 to 100 but skip the numbers that are divisible by 3
        int num = 1; // initialization
        while (num <= 100) // condition
        {
            if (num % 3 != 0) // skip numbers that are divisible by 3
            {
                System.out.println(num); // print the number
            }
            num++; // increment
        }
    }
}
