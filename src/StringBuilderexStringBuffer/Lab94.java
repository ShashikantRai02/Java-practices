package StringBuilderexStringBuffer;

public class Lab94 {
    public static void main(String[] args) {
        //String 90%
        String s1="Shashikant ";
        String s2=new String("Shashikant ");
        //StringBuffer 9%
        StringBuffer sb1=new StringBuffer("Shashikant ");
        //StringBuilder 1%
        StringBuilder sb2=new StringBuilder("Shashikant ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(s1.equals(s2)); // Output: true
        System.out.println(s1.equals(sb1)); // Output: false
        System.out.println(s1.equals(sb2)); // Output: false
        System.out.println(sb1.reverse());
        System.out.println(sb2.reverse());



    }
}
