package Arrays;

public class Lab1202DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            int[][] array;
            array = new int[][]{{1, 2 }, {4, 5}, {7, 8}};// This line declares a 2D array named array and
            // initializes it with specific values. The array is created using an anonymous array initializer,
            // which allows you to directly specify the values of the array
            // without needing to declare its size beforehand.
            // The resulting array will have 3 rows and 2 columns, with the following values:
        }
    }
}
