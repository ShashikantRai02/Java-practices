package OOpsPolmorphismoverriding;

public class Lab166overriding {
    public static void main(String[] args) {
//         Lab166overriding l=new Lab166overriding();
//        Son s=new Son();
//        s.home();
//        s.money();
//        Father f=new Father();
//        f.home();
//        f.money();
        //Dynamic    dispatch
        Father f=new Son();
        f.home();
        f.money();

    }
}
    class Father{
        void home()
        {
            System.out.println("Father has 10bhk house");
        }
        void money()
        {
            System.out.println("Father has 10cr money");
        }
    }
    class Son extends Father{
    @Override
        void home()
        {
            System.out.println("Son has 5bhk house");
        }
        void money()
        {
            System.out.println("Son has 5cr money");
        }
    }


