package StringBuilderexStringBuffer;

public class Lab99 {
    //write a program to reverse a string using StringBuffer and StringBuilder
    public static void main(String[] args) {
        String str = "Shashikant";
        // Using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("Reversed using StringBuffer: " + sb.toString());

        // Using StringBuilder
        StringBuilder sbuilder = new StringBuilder(str);
        sbuilder.reverse();
        System.out.println("Reversed using StringBuilder: " + sbuilder.toString());
    }


}
