package Whileloop;

public class Lab23 {
    public static void main(String[] args) {
        //calculate the factorial of 5
        int factorial = 1;
        int i = 1;
        while (i <= 5) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of 5 is: " + factorial);
    }
}
