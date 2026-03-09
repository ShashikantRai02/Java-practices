package Exceptionspractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab220checked {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("nonexistentfile.txt");
        // This will throw a FileNotFoundException because the file does not exist.
    }
}
