package Switchstatement;

public class Lab57IQ {
    public static void main(String[] args) {
        char ch = 'A';//
        switch(ch)// switch statement to find the ASCII value of the character
        {
//        {
//            case 'A':
//                System.out.println("Match character A");
//                break;
//        {
            case 65:// ASCII value of A is 65
                System.out.println("Match ASCII value of A");
                break;
            default:
                System.out.println("Invalid character");
        }
    }

}
