package OOPsAbstractionsuper;

public class Lab196IQ2 {
}
interface A2{
    void method1();
    void method2();
}
interface A3{
    void method3();
    void method4();
}
class B1 implements A2,A3{
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
class B2 implements A2,A3{
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

