package OOpsPolymorphis_methodoverloading;

public class Lab164overloading {
    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.m1(11,20);
        o.m1(1012,2012,3012);
        o.m1(10.5,13.5);
        o.m1("Shashi","Rai");
    }
}
class Overloading{
    void m1(int a,int b)
    {
        System.out.println("m1 with int arg");
    }
    {
        System.out.println("m1 with no arg");
    }
    void m1(int a,int b,int c)
    {
        System.out.println("m1 with int arg");
    }
    void m1(double a,double b)
    {
        System.out.println("m1 with double arg");
    }
    void m1(String a,String b)
    {
        System.out.println("m1 with String arg");
    }
}
