package Wrapperclasses;

public class Lab217 {
    public static void main(String[] args) {
        int a=11;
        Integer b=a;
        //Boxing or autoboxing
        //Boxing is the process of converting a primitive type to its corresponding wrapper class object.
        // Autoboxing is the automatic
        // conversion of a primitive type to its corresponding wrapper class object by the Java compiler.
            System.out.println(b.intValue());// unboxing or auto unboxing
        System.out.println(a);// auto unboxing
        // Unboxing is the process of converting a wrapper class object back to its corresponding primitive type.
        Integer c=100;
        int d=c;// auto unboxing
        System.out.println(d);
    }
}
