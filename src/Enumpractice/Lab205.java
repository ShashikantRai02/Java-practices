package Enumpractice;

public class Lab205 {
    public static void main(String[] args) {
        Browser b=Browser.CHROME;
        System.out.println("Browser: " + b);
        System.out.println(Browser.FIREFOX);
    }
}
enum Browser{
    CHROME, FIREFOX, EDGE, SAFARI
}