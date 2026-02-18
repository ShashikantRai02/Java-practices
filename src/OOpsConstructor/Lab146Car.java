package OOpsConstructor;

public class Lab146Car {
    String brand;
    String model;
    int year;

    // Constructor to initialize the car's attributes
    public Lab146Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display the car's information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Create a new car object
        Lab146Car myCar = new Lab146Car("Toyota", "Camry", 2020);

        // Display the car's information
        myCar.displayInfo();
    }
}
