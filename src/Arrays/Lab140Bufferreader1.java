package Arrays;

import java.io.IOException;

public class Lab140Bufferreader1 {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));// Create a BufferedReader
        // to read input from the console
        System.out.println("Enter a number : ");// Prompt the user to enter a number
        int n=Integer.parseInt(reader.readLine().trim());// Read a line of text, trim it, and parse it as an integer
        System.out.println(n);// Print the entered number
        }
    }

