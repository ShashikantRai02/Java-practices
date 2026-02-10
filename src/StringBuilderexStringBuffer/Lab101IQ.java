package StringBuilderexStringBuffer;

public class Lab101IQ {
    //write a program to reverse a string using scanner class
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();//str = "Shashikant"
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);//reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
