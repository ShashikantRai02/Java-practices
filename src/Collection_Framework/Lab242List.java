package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab242List {
    public static void main(String[] args) {
        List fruits = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry");
        System.out.println("Fruits: " + fruits);
        List arraylist=new ArrayList<>();
            arraylist.add("Apple");
            arraylist.add("Banana");
            arraylist.add("Cherry");
            arraylist.add("Date");
            arraylist.add("Elderberry");
            System.out.println("ArrayList: " + arraylist);
        System.out.println(arraylist.getClass().getName());
        System.out.println(arraylist.size());
    }
}
