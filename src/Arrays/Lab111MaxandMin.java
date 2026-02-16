package Arrays;

import java.util.Arrays;

public class Lab111MaxandMin {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
//        //logic
//        Arrays.sort(marks);
//        System.out.println(marks[marks.length - 1]);//maximum element is the last element of the sorted array
//        System.out.println(marks[0]);//minimum element is the first element of the sorted array

        //logic
        int min = marks[0];
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

    }
}
