package Collection_Framework;

public class Lab241List {
        public static void main(String[] args) {
            java.util.List<Integer> list = new java.util.ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            System.out.println("List: " + list);
            System.out.println("List size: " + list.size());
            System.out.println("Element at index 1: " + list.get(1));
            System.out.println("Contains 20: " + list.contains(20));
            System.out.println("Index of 30: " + list.indexOf(30));

            list.remove(1);
            System.out.println("List after removal: " + list);
        }
}
