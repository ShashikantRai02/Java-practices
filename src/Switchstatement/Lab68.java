package Switchstatement;

public class Lab68 {
    public static void main(String[] args) {
        int itemCode = 123;
        switch (itemCode) {
            case 123,124,125:
                System.out.println("Item code 123: Laptop");
                break;
            case 456,444,321:
                System.out.println("Item code 456: Smartphone");
                break;
            default:
                System.out.println("Unknown item code");
        }
    }
}
