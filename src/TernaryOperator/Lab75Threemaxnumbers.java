package TernaryOperator;

public class Lab75Threemaxnumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
//a>b,b>c,a>c-, b>
        // Ternary operator to find the maximum value among a, b, and c
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The maximum value among " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
