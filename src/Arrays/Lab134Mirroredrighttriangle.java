package Arrays;

public class Lab134Mirroredrighttriangle {
        public static void main(String[] args) {
            int rows = 5; // Number of rows

            for (int i = 1; i <= rows; i++)// Loop through each row
            {
                // Print leading spaces (rows - i spaces)
                for (int j = 1; j <= rows - i; j++)// Loop to print spaces before stars
                {
                    System.out.print(" ");
                }
                // Print stars (i stars)
                for (int k = 1; k <= i; k++)// Loop to print stars in each row
                {
                    System.out.print("*");
                }
                System.out.println(); // New line
            }
        }
    }


