package OOPsSuperkeywords;

public class Lab189innerclass {
}
class A{
    class B{
        void display(){
            System.out.println("This is an inner class");
        }
    }
     void show(){
        B b = new B();
        b.display();
    }
     public static void main(String[] args) {
        A a = new A();
        a.show();
    }

}
