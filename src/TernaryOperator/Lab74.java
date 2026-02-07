package TernaryOperator;

public class Lab74 {
    // Ternary operator to check if a number is even or odd
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is: " + result);
    }
}
