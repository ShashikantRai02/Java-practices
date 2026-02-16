package Arrays;

public class Lab124 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //3x3 matrix
        //Row->3
        //Column->3
        for (int i = 0; i < arr.length; i++)// arr.length gives the number of rows in the 2D array.
            // In this case, it will return 3, which is the number of rows in the matrix.
        {
            for (int j = 0; j < arr[i].length; j++)// arr[i].length gives the number of columns
                // in the current row (i) of the 2D array.
                // In this case, it will return 3 for each row, which is the number of columns in the matrix.
            {
                //System.out.print(arr[i][j]);// This line prints the element at the current
                // row (i) and column (j) of the 2D array, followed by a space.
                System.out.print("*");
            }
            System.out.println();// This line prints a newline character after each row is printed,
            // ensuring that each row of the matrix is displayed on a new line in the output.
        }
    }
}
