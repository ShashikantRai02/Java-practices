package Arrays;

public class Lab123 {
    //2nd highest element in the array by Array.sort() method
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        java.util.Arrays.sort(arr);//sorting the array in ascending order
//        int secondMax = arr[arr.length - 2];//the second highest element will be at the second last
        // index after sorting
//        System.out.println("Second highest element: " + secondMax);
        System.out.println(arr [arr.length - 2]);
    }

}
