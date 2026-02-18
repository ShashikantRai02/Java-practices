package OOpsInheritance;

public class Lab150 {
    public static void main(String[] args) {
        Lab149Son son=new Lab149Son();
        System.out.println(son.gold);
        son.bhk2();
        son.bhk3();
        Lab148Father father=new Lab148Father();
        System.out.println(father.gold);
        father.bhk2();
//        father.bhk3(); // This will cause a compile-time error since bhk3() is not defined in Lab148Father
    }
}
