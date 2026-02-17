package OOPs;

public class Lab144 {

}
class cat// Class to represent a cat with attributes and methods
{
    String name;
    int age;
    String color;

    // Constructor to initialize the cat's attributes
    public cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Method to display the cat's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        // Create a new cat object
        cat myCat = new cat("Whiskers", 3, "Gray");// Initialize the cat's name, age, and color

        // Display the cat's information
        myCat.displayInfo();
    }
}
