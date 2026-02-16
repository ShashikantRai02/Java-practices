package Arrays;

public class Lab119secondhigh {
    //write a program to find the second highest element in an array under easy way
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second highest element.");
        } else {
            System.out.println("Second highest element: " + secondMax);
        }
    }

}
