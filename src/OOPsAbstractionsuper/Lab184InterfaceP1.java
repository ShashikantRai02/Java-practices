package OOPsAbstractionsuper;

public class Lab184InterfaceP1 {
    public static void main(String[] args) {
        car3 c = new car3();
        c.drive();
    }

}
class car3 implements Brakes,Engine2{
    void drive(){
        applyBrakes();
        startEngine();
        testengine();
        testengine2();
        stopEngine();
    }
    @Override
    public void applyBrakes() {
        System.out.println("Applying brakes in car3");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine of car3");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine of car3");
    }

}
interface Brakes{
    void applyBrakes();
}
interface Engine2{
    void startEngine();
    void stopEngine();
    default void testengine(){
        System.out.println("Testing the engine");
    }
    default void testengine2(){
        System.out.println("Testing the engine2");
    }
}
