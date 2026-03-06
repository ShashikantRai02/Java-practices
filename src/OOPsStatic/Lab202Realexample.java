package OOPsStatic;

public class Lab202Realexample {
}
class ATB14x{
    int phonenumber=1234567890;
    String name="John Doe";
    static String company="ATB14x";
    static void markattendance(){
        System.out.println("Attendance marked for " + company);
    }
    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phonenumber);
    }
}
