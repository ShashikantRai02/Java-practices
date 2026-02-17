package OOPs;

public class Lab143Constructor {
    String name;
    int age;

    // Constructor to initialize the person's name and age
    public Lab143Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a new person object
        Lab143Constructor person1 = new Lab143Constructor("Alice", 30);

        // Display the person's information
        person1.displayInfo();
    }
}
