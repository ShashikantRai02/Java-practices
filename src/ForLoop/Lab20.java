package ForLoop;

public class Lab20 {
    public static void main(String[] args) {
        //calculate the factorial of 5
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5 is: " + factorial);

    }
}
