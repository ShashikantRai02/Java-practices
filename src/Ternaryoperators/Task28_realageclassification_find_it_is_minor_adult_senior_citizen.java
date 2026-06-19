package Ternaryoperators;

public class Task28_realageclassification_find_it_is_minor_adult_senior_citizen {
    public static void main(String[] args){
        int age=65;
        String result=age<18?"minor":age<60?"adult":"senior citizen";
        System.out.println(result);
    }
}
