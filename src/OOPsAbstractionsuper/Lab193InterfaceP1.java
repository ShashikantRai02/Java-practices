package OOPsAbstractionsuper;

public class Lab193InterfaceP1 {
    public static void main(String[] args) {
        car4 c = new car4();
        c.drive();
    }
}
class car4 implements Brakes2,Engine4{
    void drive(){
        applyBrakes();
        startEngine();
        testengine();
        testengine2();
        stopEngine();
    }
    @Override
    public void applyBrakes() {
        System.out.println("Applying brakes in car4");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine of car4");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine of car4");
    }

}
interface Brakes2{
    void applyBrakes();
}
interface Engine4{
    void startEngine();
    void stopEngine();
    default void testengine(){
        System.out.println("Testing the engine");
    }
    default void testengine2(){
        System.out.println("Testing the engine2");
    }
}
