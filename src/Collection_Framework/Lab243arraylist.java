package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab243arraylist {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("Hello");
        list.add("1");
        list.add(2);
        list.add(3.14);
        list.add(true);
        System.out.println("List: " + list);
        System.out.println("List size: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Hello"));
        System.out.println(list.indexOf(3.14));
    }
}
