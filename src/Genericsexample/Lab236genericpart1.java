package Genericsexample;

import javax.swing.*;

public class Lab236genericpart1 {
    public static void main(String[] args) {
        temp("Hello", "World");
        temp(123, 456);
        temp(3.14, 2.718);

//            Box intBox = new Box<>();
//            intBox.setSize(123);
//            System.out.println("Integer Value: " + intBox.getY());
//
//            Box strBox = new Box();
//            strBox.setSize("Hello, Generics!");
//            System.out.println("String Value: " + strBox.getY());
//        Box intBox = new Box();
//        intBox.setSize(123);
//        System.out.println("Integer Value: " + intBox.getY());
//
//        Box strBox = new Box();
//        strBox.setSize("Hello, Generics!");
//        System.out.println("String Value: " + strBox.getY());
    }
    static  <T> T temp(T a, T b)// generic method
    {
        return null;
    }
}
