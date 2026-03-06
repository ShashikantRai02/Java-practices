package OOPsAbstractionsuper;

public class Lab195MultipleInheritance {
    public static void main(String[] args) {
        Son1 s = new Son1();
        s.money();
    }
}
interface Father{
void money();
}
interface Father2{
    void money();
}
class Son1 implements Father,Father2{
    @Override
    public void money() {
        System.out.println("Money inherited from father");
    }
}
