package Ternaryoperators;

public class Task26_findthemaxnumber_between_threenumbers {
    public static void main(String[] args){
        int a=2;
        int b=9;
        int c=-11;
        int result=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(result);
    }
}
