package Collection_Framework;

public class Lab239 {
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "Hello";
            String str3 = new String("Hello");

            System.out.println("str1: " + str1);
            System.out.println("str2: " + str2);
            System.out.println("str3: " + str3);

            System.out.println("str1 hashCode: " + str1.hashCode());
            System.out.println("str2 hashCode: " + str2.hashCode());
            System.out.println("str3 hashCode: " + str3.hashCode());

            System.out.println("str1 equals str2: " + str1.equals(str2));
            System.out.println("str1 equals str3: " + str1.equals(str3));
        }
}
