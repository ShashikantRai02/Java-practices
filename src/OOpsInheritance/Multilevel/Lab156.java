package OOpsInheritance.Multilevel;

public class Lab156 {
    public static void main(String[] args) {
        Lab155Son s1 = new Lab155Son();
        s1.son();
        s1.property();
        s1.home();
        s1.money();
        Lab154Father f1 = new Lab154Father();
        f1.property();
            f1.home();
            f1.money();
            f1.f2();
            Lab153Grandfather g1 = new Lab153Grandfather();
            g1.home();
            g1.money();
            // Dynamic dispatch
            Lab153Grandfather g2 = new Lab154Father();
            g2.home();
                g2.money();
                //g2.f2(); // Not allowed, as g2 is reference of Lab153Grandfather
                Lab153Grandfather g3 = new Lab155Son();
                g3.home();
                g3.money();
                //g3.property(); // Not allowed, as g3 is reference of Lab153Grandfather

    }
}
