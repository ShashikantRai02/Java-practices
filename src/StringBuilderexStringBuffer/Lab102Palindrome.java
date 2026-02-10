package StringBuilderexStringBuffer;

public class Lab102Palindrome {
    //write a program for string palindrome
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";// reversed = reversed + str.charAt(i);
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);//reversed = reversed + str.charAt(i);
        }
        if (str.equals(reversed)) //equals() method is used to compare the content of the string
        {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
