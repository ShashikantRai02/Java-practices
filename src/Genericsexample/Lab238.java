package Genericsexample;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {
    public static void main(String[] args) {
        List list_of_webelements = new ArrayList<>();
        list_of_webelements.add("Username Field");
        list_of_webelements.add("Password Field");
        list_of_webelements.add("Login Button");
        list_of_webelements.add(123); // This will compile but is not type-safe
        list_of_webelements.add(45.67); // This will compile but is not type-safe

    }
}
