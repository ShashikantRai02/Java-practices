package Ternaryoperators;

public class Task29_2ndtimepractices_realageclassifications {
    public static void main(String[] args){
        int age=50;
        String real_age_classification=age<18?"minor":age<59?"adult":"senior";
        System.out.println(real_age_classification);
    }
}
