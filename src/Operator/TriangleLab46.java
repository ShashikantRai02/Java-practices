package Operator;

public class TriangleLab46 {
    //Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
    public static void main(String[] args) {
        int side1 = 5; // length of the first side
        int side2 = 5; // length of the second side
        int side3 = 5; // length of the third side

        if (side1 == side2 && side2 == side3) { // check if all sides are equal
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) { // check if exactly two sides are equal
            System.out.println("The triangle is isosceles.");
        } else { // if no sides are equal
            System.out.println("The triangle is scalene.");
        }
    }
}
