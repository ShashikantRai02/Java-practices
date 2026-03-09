package Enumpractice;

public class Lab206 {
    public static void main(String[] args) {
        Day d=Day.MONDAY;// enum variable can hold only one of the predefined constant value
        System.out.println("Day: " + d);
        System.out.println(Day.FRIDAY);
    }
}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
