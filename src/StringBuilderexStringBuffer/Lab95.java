package StringBuilderexStringBuffer;

public class Lab95 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Shashikant");
        sb1.append("Rai");
        System.out.println(sb1.toString()); // Output: ShashikantRai
        String s1="Shashikant";
        s1=s1+"Rai";
        System.out.println(s1); // Output: ShashikantRai
    }
}
