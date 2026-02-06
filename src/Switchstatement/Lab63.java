package Switchstatement;

public class Lab63 {
    public static void main(String[] args) {
        short s = 300;
        switch (s) {
            case 300:
                System.out.println("Matched short value 300");
                break;
            case 400:
                System.out.println("Matched short value 400");
                break;
            default:
                System.out.println("No match found for the short value");
        }
    }
}
