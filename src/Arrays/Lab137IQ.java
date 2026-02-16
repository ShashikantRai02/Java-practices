package Arrays;

public class Lab137IQ {
    //how do you check the equality of two arrays in java
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; // First array
        int[] array2 = {1, 2, 3, 4, 5}; // Second array

        boolean areEqual = true; // Flag to indicate if arrays are equal

        // Check if lengths of the arrays are the same
        if (array1.length != array2.length) {
            areEqual = false; // Arrays cannot be equal if their lengths differ
        } else {
            // Compare each element of the arrays
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) { // If any element differs
                    areEqual = false; // Set flag to false
                    break; // Exit the loop early
                }
            }
        }

        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
