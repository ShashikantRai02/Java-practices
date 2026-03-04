package OOPsAbstractionsuper;

public class Lab183 {
    public static void main(String[] args) {
        swarajTractor s = new swarajTractor();
        s.drive();
    }
}
abstract class Car2{
    abstract void startCar();
    abstract void stopCar();

}
class swarajTractor extends Car2 implements Tyre1,Gear1,Engine1{
    void drive(){
         this.startCar();
         this.stopCar();
            rubberTyre();
            blackColorDoToTyre();
            changeGear();
            startEngine();
                stopEngine();


    }

    @Override
    void startCar() {
        System.out.println("Starting the swarajTractor");
    }

    @Override
    void stopCar() {
        System.out.println("Stop the swarajTractor");

    }

    @Override
    public void rubberTyre() {
        System.out.println("Rubber Tyre is used in swarajTractor");
    }

    @Override
    public void blackColorDoToTyre() {
        System.out.println();

    }

    @Override
    public void changeGear() {
        System.out.println("Change Gear in swarajTractor");

    }

    @Override
    public void startEngine() {
            System.out.println("Starting the Engine of swarajTractor");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the Engine of swarajTractor");

    }
}
interface Tyre1{
    void rubberTyre();
    void blackColorDoToTyre();
}
interface Gear1{
    void changeGear();
}
interface Engine1{
    void startEngine();
    void stopEngine();
}
