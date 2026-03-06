package OOPsAbstractionsuper;

public class Lab194IQ1 {
}
interface I2{
    void method1();
    void method2();
}
interface I3{
    void method3();
    void method4();
}
class A1 implements I2,I3{
    @Override
    public void method1() {
        System.out.println("Method 1 implemented");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implemented");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 implemented");
    }

    @Override
    public void method4() {
        System.out.println("Method 4 implemented");
    }
}
