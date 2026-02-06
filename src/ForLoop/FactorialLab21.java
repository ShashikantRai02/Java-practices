package ForLoop;

public class FactorialLab21 {
    public static void main(String[] args) {
        int number = 5; // You can change this value to compute the factorial of a different number
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial =factorial* i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
