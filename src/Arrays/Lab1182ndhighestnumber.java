package Arrays;

public class Lab1182ndhighestnumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int max = Integer.MIN_VALUE;// Initialize max to the smallest possible integer value
        int secondMax = Integer.MIN_VALUE;// Initialize secondMax to the smallest possible integer value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number.");
        } else {
            System.out.println("Second highest number: " + secondMax);
        }
    }
}
