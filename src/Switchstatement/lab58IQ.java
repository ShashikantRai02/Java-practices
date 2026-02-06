package Switchstatement;

public class lab58IQ {
    public static void main(String[] args) {
        boolean isRaining = true; // Example boolean variable
        switch (isRaining ? 1 : 0) { // Convert boolean to int (1 for true, 0 for false)
            case 1:
                System.out.println("It's raining. Don't forget to take an umbrella!");
                break;
            case 0:
                System.out.println("It's not raining. Enjoy your day!");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
