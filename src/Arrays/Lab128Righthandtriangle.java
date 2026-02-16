package Arrays;

public class Lab128Righthandtriangle {
    public static void main(String[] args) {
        int size = 5; // Size of the triangle
        for (int i = 1; i <= size; i++) { // Loop through each row
            for (int j = 1; j < i; j++) { // Loop to print spaces before stars
                System.out.print(" ");// Print space
            }
            for (int k = 1; k <= size - i + 1; k++) { // Loop to print stars in each row
                System.out.print("\uD83D\uDE0A");// Print a smiley face (you can replace it with "*" for a simple star)
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
