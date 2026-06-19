package Interviewpreparation;

public class reversedstring {

    public static void main(String[] args) {
        String str = "Hello World";
        String reversedStr = "";

        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i); // Append each character to the reversed string
        }

//        System.out.println("Original String: " + str);
        System.out.println(reversedStr);
    }
}
