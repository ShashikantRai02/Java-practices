package Switchstatement;

public class Lab64 {
    public static void main(String[] args) {
        long l = 1000L;
        switch ((int) l) {
            case 1000:
                System.out.println("Matched long value 1000");
                break;
            case 2000:
                System.out.println("Matched long value 2000");
                break;
            default:
                System.out.println("No match found for the long value");
        }
    }
}
