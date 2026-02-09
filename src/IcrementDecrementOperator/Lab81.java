package IcrementDecrementOperator;

public class Lab81 {
    public static void main(String[] args) {
        int a=10;
        int b=a++ + ++a + a++ + ++a;// explain
        // expression and result table
        // Line no/a/Result b
        // 5/10/11/10
        // 6/12/12/10
        // 7/13/13/10
        // 8/14/14/10
        System.out.println(a);// Output: 14
        System.out.println(b);// Output: 45
    }
}
