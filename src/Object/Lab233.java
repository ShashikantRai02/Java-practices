package Object;

public class Lab233 extends Object {
    public static void main(String[] args) {
        Lab233 obj1 = new Lab233();
        Lab233 obj2 = new Lab233();

        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);

        System.out.println("obj1 hashCode: " + obj1.hashCode());
        System.out.println("obj2 hashCode: " + obj2.hashCode());

        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
    }

}
