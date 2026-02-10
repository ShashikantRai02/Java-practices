package StringBuilderexStringBuffer;

public class Lab98 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Shashikant");
        sb1.append(123);
//        sb1.reverse();
        System.out.println(sb1); //Shashikant123
        sb1.replace(0, sb1.length(), sb1.reverse().toString());
//        sb1.replace(int start:0,)
        System.out.println(sb1);
// Output: 321tnakihsahS
    }
}
