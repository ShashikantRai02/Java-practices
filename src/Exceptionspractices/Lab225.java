package Exceptionspractices;

public class Lab225 {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute, regardless of whether an exception was thrown or caught.");
        }
    }
}
