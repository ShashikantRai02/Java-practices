package Switchstatement;

public class Lab70IQ {
    public static void main(String[] args) {
        int a = 11;
        switch (-1) {
            case -1:
                System.out.println("Matched value -1");
                break;
            case 2:
                System.out.println("Matched value 2");
                break;
            default:
                System.out.println("No match found for the value");
        }
    }
}
