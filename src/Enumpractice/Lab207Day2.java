package Enumpractice;

public class Lab207Day2 {
    public static void main(String[] args) {


        Day2 d=Day2.MONDAY;
        System.out.println("Day: " + d);
        System.out.println(Day2.FRIDAY);
    }
    enum Day2{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

}
