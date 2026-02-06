package Switchstatement;

public class Lab62 {
    public static void main(String[] args) {
        byte b = 10;
        switch (b) {
            case 10:
                System.out.println("Matched byte value 10");
                break;
            case 20:
                System.out.println("Matched byte value 20");
                break;
            default:
                System.out.println("No match found for the byte value");
        }
    }
}
