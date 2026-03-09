package Exceptionspractices;

public class Lab221 {
    public static void main(String[] args) {
        String str = null;

        try {
            str.length();
        } catch (Exception e) {
            System.out.println("error length: " + e.getMessage());
        }

        // This will throw a NullPointerException because we are trying to call a method on a null reference.

        try {
            str.trim();
        } catch (Exception e) {
            System.out.println("TRIM not allowed for the null value");
        }


        // This will also throw a NullPointerException for the same reason as above.
    }
}
