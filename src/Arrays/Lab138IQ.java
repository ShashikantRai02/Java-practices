package Arrays;

public class Lab138IQ {
    //write a program to find the maximum element in an array
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8}; // Sample array
        int max = array[0]; // Initialize max with the first element

        for (int i = 1; i < array.length; i++) { // Loop through the array starting from the second element
            if (array[i] > max) { // If the current element is greater than max
                max = array[i]; // Update max
            }
        }

        System.out.println("The maximum element in the array is: " + max); // Print the maximum element
    }
}
