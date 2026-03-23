package Genericsexample;

import java.util.List;

public class Lab237realautomation {
    public static void main(String[] args) {
        List list = List.of("Hello", "World", 123, 45.67);
            for (Object obj : list) {
                System.out.println(obj);
            }

    }
}

