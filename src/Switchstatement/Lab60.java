package Switchstatement;

public class Lab60 {
    public static void main(String[] args) {
        String day = "Monday"; // Example string variable
        switch (day) {
            case "Monday":
                System.out.println("It's Monday. Start of the week!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday. Keep going!");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday. Halfway there!");
                break;
            case "Thursday":
                System.out.println("It's Thursday. Almost the weekend!");
                break;
            case "Friday":
                System.out.println("It's Friday. Weekend is here!");
                break;
            case "Saturday":
                System.out.println("It's Saturday. Enjoy your day off!");
                break;
            case "Sunday":
                System.out.println("It's Sunday. Rest and recharge!");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }
    }
}
