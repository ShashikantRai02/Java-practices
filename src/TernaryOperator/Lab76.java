package TernaryOperator;

public class Lab76 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 150;
        // Ternary operator to find the maximum value among a, b, and c
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The maximum value among " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
