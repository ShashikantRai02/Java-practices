package IcrementDecrementOperator;

public class Lab85 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + ++a);// expression and result table
        System.out.println(a);// Output: 12
        //++a=A->expA->A=11->expB->A=12
        //++a=B->expB->A=12
        //Line no/A/expA/expB/result
        // 5/10/11/12/23

    }
}
