package OOPsSuperkeywords;

public class Lab185 {
}
class BaseClass{
    void display(){
        System.out.println("Base class method");
    }
}
class TestClass extends BaseClass{
    void display(){
        System.out.println("Test class method");
    }
    void show(){
        this.display();
        super.display();
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.show();
    }
}

