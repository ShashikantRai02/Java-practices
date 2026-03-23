package Collection_Framework;

public class Lab240List {
        public static void main(String[] args) {
            java.util.List<String> list = new java.util.ArrayList<>();
            list.add("Hello");
            list.add("World");
            list.add("Java");

            System.out.println("List: " + list);
            System.out.println("List size: " + list.size());
            System.out.println("Element at index 1: " + list.get(1));
            System.out.println("Contains 'Java': " + list.contains("Java"));
            System.out.println("Index of 'World': " + list.indexOf("World"));

            list.remove(1);
            System.out.println("List after removal: " + list);
        }
}
