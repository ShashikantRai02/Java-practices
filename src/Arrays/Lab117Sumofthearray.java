package Arrays;

public class Lab117Sumofthearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];// sum += arr[i] is used to add the current element of the array to the sum variable. It is equivalent to sum = sum + arr[i];
        }
        System.out.println("Sum of the array: " + sum);
    }
}
