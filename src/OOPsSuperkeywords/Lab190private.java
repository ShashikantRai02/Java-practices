package OOPsSuperkeywords;

public class Lab190private {
}
class xyz{
    xyz(){
        System.out.println("This is a constructor");
    }
    protected int mygold = 100;

}
class CAB extends xyz{
    void show(){
        System.out.println("Gold inherited from xyz: "+mygold);
    }
    public static void main(String[] args) {
        CAB c = new CAB();
        c.show();
    }
}

