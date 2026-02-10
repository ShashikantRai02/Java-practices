package StringBuilderexStringBuffer;

public class Lab100IQ {
    //write a program to reverse the string without using inbuilt method
    public static void main(String[] args) {
        String str = "Shashikant";
        String reversed = "";// reversed = reversed + str.charAt(i);
        for (int i = str.length() - 1; i >= 0; i--)//i=10,9,8,7,6,5,4,3,2,1,0
        {
            reversed += str.charAt(i);//reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}
