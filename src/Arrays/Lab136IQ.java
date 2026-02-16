package Arrays;

public class Lab136IQ {
    //how to check if a number is prime or not
    public static void main(String[] args) {
        int num = 29; // Number to check
        boolean isPrime = true; // Flag to indicate if the number is prime

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisibility up to the square root of num
                if (num % i == 0) { // If num is divisible by any number other than 1 and itself
                    isPrime = false; // Set flag to false
                    break; // Exit the loop early
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
