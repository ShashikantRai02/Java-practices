package Switchstatement;

public class LongLab59 {
    public static void main(String[] args) {
        long num = 100L; // Example long variable
        switch ((int) num) { // Cast long to int for switch statement
            case 100:
                System.out.println("Matched long value 100");
                break;
            case 200:
                System.out.println("Matched long value 200");
                break;
            default:
                System.out.println("No match found for the long value");
        }
    }
}
