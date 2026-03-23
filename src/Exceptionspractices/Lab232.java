package Exceptionspractices;

public class Lab232 {
    public static void main(String[] args) {
        try {
            int a=10/10;
            System.out.println("Result: " + a);
            System.exit(0); // Terminate the program immediately
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
