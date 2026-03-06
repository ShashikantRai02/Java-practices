package OOPsSuperkeywords;

public class Lab191Abstract {
}
abstract class AmitFather{
    abstract void homeloan();
    void carloan()
    {
        System.out.println("Car loan given");
    }
}
class AmitSon extends AmitFather{
    void homeloan(){
        System.out.println("Home loan given");
    }
    public static void main(String[] args) {
        AmitSon s = new AmitSon();
        s.homeloan();
        s.carloan();
    }
}