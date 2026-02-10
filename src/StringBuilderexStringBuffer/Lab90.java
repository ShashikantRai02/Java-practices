package StringBuilderexStringBuffer;

public class Lab90 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        StringBuilder sb=new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        System.out.println(sb.toString());// Output: HelloWorld
    }
}
