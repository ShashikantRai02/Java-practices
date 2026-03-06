package OOPsStatic;

public class Lab201SIB {
    public static void main(String[] args) {
        System.out.println("Main method of Lab201 executed");
        System.out.println("Value of static variable a: " + A.a);
        A.m1();
    }
}
class A{
    static {
        System.out.println("Static block of class A executed");
        System.out.println("you can write a code reading excel file or database connection");
    }
    static int a=100;
    static void m1(){
        System.out.println("Static method m1 of class A executed");
    }

}
