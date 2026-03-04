package OOpsPolmorphismoverriding;

public class Lab167Realoverriding {
    public static void main(String[] args) {
        commonToAll c=new commonToAll();
        c.openBrowser();
        c.money();

        chrometc1 ch=new chrometc1();
        ch.openBrowser();
        ch.money();

        firefoxtc2 f=new firefoxtc2();
        f.openBrowser();
        f.money();
        //Dynamic    dispatch
        commonToAll c1=new chrometc1();
        c1.openBrowser();
        c1.money();
    }
}
class commonToAll{
    void openBrowser()
    {
        System.out.println("open the browser");
    }
    void money()
    {
        System.out.println("Money with 10cr");
    }
}
class chrometc1 extends commonToAll{
    @Override
    void openBrowser()
    {
        System.out.println("open the chrome browser");
    }
}
class firefoxtc2 extends commonToAll{
    @Override
    void openBrowser()
    {
        System.out.println("open the firefox browser");
    }
}
