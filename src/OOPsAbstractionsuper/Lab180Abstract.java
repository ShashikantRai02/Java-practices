package OOPsAbstractionsuper;

public class Lab180Abstract {

    public static void main(String[] args) {
        // Car
        Car tesla = new Car(300);
        tesla.drive();

    }
}

class Vehicles{
    public int maxSpeed = 180;

    void noTest() {
        System.out.println("Empty!");
    }

    Vehicles(){
        System.out.println("Default Const");
    }

    Vehicles(int a ){
        System.out.println("Param Con");
    }
    Vehicles(int a, int b ){
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void drive(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicles{

    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    Car(int a){
        System.out.println("PC Car");
    }

    void test(){}

    @Override
    void drive() {
        System.out.println("Over ridden the Vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }

}

