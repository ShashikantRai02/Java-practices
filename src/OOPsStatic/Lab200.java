package OOPsStatic;

public class Lab200 {
    public static void main(String[] args) {
        ATBX14.markattendance(); // Calling static method using class name
        ATBX14 a1 = new ATBX14();
        a1.displayinfo(); // Calling instance method using object reference
    }
}
class ATBX14{
    int phonenumber=1234567890;
    String name="John Doe";
    static String company="ATBX14";
    static void markattendance(){
        System.out.println("Attendance marked for " + company);
//        System.out.println(this.phonenumber);
    }
    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phonenumber);
    }
}
