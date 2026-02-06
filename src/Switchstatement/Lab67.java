package Switchstatement;

public class Lab67 {
    public static void main(String[] args) {
        int itemcode=001;
        switch (itemcode) {
            case 001->System.out.println("Item code 001 selected: Apple");

            case 002->System.out.println("Item code 002 selected: Banana");

            case 003->System.out.println("Item code 003 selected: Cherry");
            default->System.out.println("Invalid item code");
        }
    }
}
