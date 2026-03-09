package Exceptionspractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab229 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f=new FileReader(new File("abc.txt"));
    }
}
