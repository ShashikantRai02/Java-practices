package Exceptionspractices;

public class Lab219unchecked {
    public static void main(String[] args) {
        int a=0;
        int b=11;
        int c=b/a;// This will throw an ArithmeticException because division by zero is not allowed in Java.
        System.out.println("Result: " + c);

    }
}
