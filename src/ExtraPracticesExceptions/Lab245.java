package ExtraPracticesExceptions;


public class Lab245 {
    public static void main(String[] args) {
        try {
            int a =  10/10;
            System.out.println("Try Executed");
            System.exit(0);// This will terminate the program immediately, so the finally block will not be executed.
//            return;
        } catch (Exception e) {
            System.out.println("Catching the exception");
        } finally {
            System.out.println("I will be always executed!");
        }

    }
}
