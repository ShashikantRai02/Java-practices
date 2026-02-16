package Arrays;

public class Lab139Bufferreader {
        public static void main(String[] args) {
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            try {
                System.out.print("Enter a string: ");
                String input = reader.readLine(); // Read a line of text from the user
                System.out.println("You entered: " + input); // Print the entered string
            } catch (java.io.IOException e) {
                e.printStackTrace(); // Handle potential IOException
            }
        }
}
