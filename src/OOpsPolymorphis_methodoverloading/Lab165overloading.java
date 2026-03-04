package OOpsPolymorphis_methodoverloading;

public class Lab165overloading {
    public static void main(String[] args) {
        home h=new home();
        h.home();
        h.home(10);
        h.home("10bhk with swimming pool");
    }}
    class home{
        void home()
        {
            System.out.println("Home with 10bhk");
        }
        void home(int a)
        {
            System.out.println("Home with "+a+"bhk");
        }
        void home(String a)
        {
            System.out.println("Home with "+a);
        }
    }

