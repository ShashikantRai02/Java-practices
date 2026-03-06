package OOPsStatic;

public class Lab204Static {
    public static void main(String[] args) {
        System.out.println("Driver: " + Automation.driver);
        System.out.println("URL: " + Automation.url);
        Automation a=new Automation();
        System.out.println("Driver2: " + a.driver2);
        System.out.println("Driver3: " + a.driver3);
//        a.driver2="firefox";
//        a.driver3="edge";
    }
}
class Automation{
    static String driver="chrome";
    static String url="https://www.google.com";
    static String driver2;
    static String driver3;
}
