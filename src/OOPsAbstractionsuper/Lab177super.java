package OOPsAbstractionsuper;

public class Lab177super {
    public static void main(String[] args) {
        car c=new car();
        c.run();
        c.test();
    }



}
class Vehicle{
    public int maxspeed=100;

    void run(){
        System.out.println("Vehicle is running");
    }
    void Vehicle(){
        System.out.println("Vehicle class default constructor");
    }
    void Vehicle(String name){
        System.out.println("Vehicle class parameterized constructor: "+name);
    }
    void Vehicle(int speed){
        System.out.println("Vehicle class parameterized constructor: "+speed);
    }
    void Message(){
        System.out.println("Vehicle class method");
    }
    void Message(String msg){
        System.out.println("Vehicle class method with parameter: "+msg);
    }
    void Display(){
        System.out.println("Vehicle class display method");
    }
}
class car extends Vehicle{
    private int maxspeed=200;
    void run(){
        System.out.println("Car is running");
        super.run();//invoking parent class method
        super.Vehicle();//invoking parent class method

    }
    void test(){
        System.out.println("Car max speed: "+maxspeed);
        System.out.println("Vehicle max speed: "+super.maxspeed);
        super.Vehicle("Sedan");//invoking parent class method with parameter
        super.Vehicle(150);//invoking parent class method with parameter
        super.Message("Hello from Car");//invoking parent class method with parameter
        super.Display();//invoking parent class method
    }
}
