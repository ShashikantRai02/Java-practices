package Arrays;

public class Lab131circlepattern {
    public static void main(String[] args) {
        int size = 5; // Size of the pattern
        for (int i = 1; i <= size; i++) { // Loop through each row
            for (int j = 1; j <= size; j++) { // Loop to print stars in each row
                if (i == 1 || i == size || j == 1 || j == size) {
                    //System.out.print("\uD83D\uDE0A");// Print a smiley face (you can replace it with "*" for a simple star)
                    System.out.println("*");
                } else {
                    System.out.print(" "); // Print space for inner part of the circle
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
