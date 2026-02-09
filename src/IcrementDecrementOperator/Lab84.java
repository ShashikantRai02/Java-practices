package IcrementDecrementOperator;

public class Lab84 {
    public static void main(String[] args) {
        int a=10;
//        int result=++a + a++ + ++a + a++ + ++a;// expression and result table
        //Line no/a/Result result
        // 5/10/11
        // 6/11/22
        // 7/12/34
        // 8/12/46
        // 9/13/59
        System.out.println(a++ + ++a);// Output: 13
        System.out.println(a);// Output: 14
//        System.out.println(result);// Output: 59
    }
}
