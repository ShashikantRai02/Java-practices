package Arrays;

public class Lab130circle {
    public static void main(String[] args) {
        double radius = 7.5; // Example radius
        double area = Math.PI * Math.pow(radius, 2); // Area = πr²
        double circumference = 2 * Math.PI * radius; // Circumference = 2πr

        System.out.printf("For a circle with radius %.2f:%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
    }
}
