package Switchstatement;

public class Lab65 {
    public static void main(String[] args) {
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("Matched char value 'A'");
                break;
            case 'B':
                System.out.println("Matched char value 'B'");
                break;
            default:
                System.out.println("No match found for the char value");
        }
    }
}
