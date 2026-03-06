package OOPsAbstractionsuper;

public class Lab197IQinterfacevariables {
    public static void main(String[] args) {
        C1 c = new C1();
        c.method1();
    }
}
interface I4{
    int a = 10; // Interface variable (implicitly public, static, and final)
    void method1();
}
class C1 implements I4{
    @Override
    public void method1() {
        System.out.println("Value of a: " + a); // Accessing the interface variable
    }
}
