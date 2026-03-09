package Exceptionspractices;

public class Lab222 {
    public static void main(String[] args) {
        int c=0;
        int d=0;

        try {
            c=10/d;
        } catch (Exception e) {
            System.out.println("not allowed");
        }
        catch (Throwable e) {
            System.out.println("Throwable: " + e.getMessage());
        }
//        catch (ArithmeticException e) {
//            System.out.println("ArithmeticException: " + e.getMessage());
//        }


        // This will throw an ArithmeticException because division by zero is not allowed in Java.
    }
}
