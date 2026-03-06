package OOPsSuperkeywords;

public class Lab188 {
    public static void main(String[] args) {
        Car c = new Car(200, "Red");
        c.start();
        c.message();
        c.message("Sedan");
        c.drive();
    }
}


















class Vehicle{
    public int maxSpeed = 120;
    void noTest(){
        System.out.println("This is a no test method");
    }
    void start(){
        System.out.println("Starting the vehicle");
    }
    Vehicle(){
        System.out.println("Vehicle class constructor");
    }
    Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle class constructor with max speed: "+maxSpeed);
    }
    Vehicle(int maxSpeed, String color){
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle class constructor with max speed: "+maxSpeed+" and color: "+color);
    }
    void message(){
        System.out.println("This is a vehicle");
    }
    void message(String type){
        System.out.println("This is a "+type);
    }
    void drive(){
        System.out.println("Max speed of the vehicle: "+maxSpeed);
    }

}
class Car extends Vehicle{
    private int maxSpeed = 150;
    void test(){
        System.out.println("This is a test method in car class");
    }
    Car(){
        super();
        System.out.println("Car class constructor");
    }
    Car(int maxSpeed){
        super(maxSpeed);
        System.out.println("Car class constructor with max speed: "+maxSpeed);
    }
    Car(int maxSpeed, String color){
        super(maxSpeed, color);
        System.out.println("Car class constructor with max speed: "+maxSpeed+" and color: "+color);
    }
    void start(){
        super.start();
        System.out.println("Starting the car");
    }
    void message(){
        super.message();
        System.out.println("This is a car");
    }
    void message(String type){
        super.message(type);
        System.out.println("This is a "+type+" car");
    }
    @Override
    void drive(){
        super.drive();
        System.out.println("Max speed of the car: "+maxSpeed);
        System.out.println("Max speed of the vehicle from car class: "+this.maxSpeed);
        System.out.println("Max speed of the vehicle from super class: "+super.maxSpeed);
        super.noTest();
        this.test();

    }
}
