package Arrays;

public class Lab114userinput {
        public static void main(String[] args) {
            int[] arr = new int[5];
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Enter 5 integers:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        }
}
