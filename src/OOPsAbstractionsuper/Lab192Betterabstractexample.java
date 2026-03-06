package OOPsAbstractionsuper;

public class Lab192Betterabstractexample {
    public static void main(String[] args) {
        Alto1 a = new Alto1();
        a.drive();

    }
}
abstract class car2{
    abstract void startCar();
    abstract void stopCar();
}
class Alto1 extends car2 implements Tyre2,Gear2,Engine3{
    void drive(){
        this.startCar();
        this.stopCar();
        rubberTyre();
        blackColorDoToTyre();
        changeGear();

    }

    @Override
    void startCar() {
        System.out.println("Starting the Alto");
    }

    @Override
    void stopCar() {
        System.out.println("Stop the Alto");
    }

    @Override
    public void rubberTyre() {
        System.out.println("Rubber Tyre is used in Alto");
    }

    @Override
    public void blackColorDoToTyre() {
        System.out.println("Black color is given to the tyre of Alto");

    }

    @Override
    public void changeGear() {
        System.out.println("Change Gear in Alto");

    }

    @Override
    public void startEngine() {
        System.out.println("Starting the Engine of Alto");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the Engine of Alto");

    }
}
interface Tyre2{
    void rubberTyre();
    void blackColorDoToTyre();
}
interface Gear2{
    void changeGear();
}
interface Engine3{
    void startEngine();
    void stopEngine();
}
