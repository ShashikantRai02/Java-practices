package OOPsSuperkeyword;

public class Lab175super {
}
class BaseClass{
    BaseClass(){
        System.out.println("Base class default constructor");
    }
    BaseClass(String browser){
        this.browser=browser;
        System.out.println("Base class parameterized constructor: "+browser);
    }
    private String browser;

    public String getBrowser() //getter method
    {
        return browser;
    }

    public void setBrowser(String browser) {
        browser = browser;
    }
    void OpenBrowser()
    {
        System.out.println("Browser is opened");
    }
    void OpenBrowser(String BrowserName)
    {
        System.out.println("Browser is opened: "+BrowserName);
    }
    void CloseBrowser()
    {
        System.out.println("Browser is closed");
    }
}
class TestCase extends BaseClass{
    void TestC(){

    }
    public TestCase(){
        super("Chrome");//invoking parent class parameterized constructor
        System.out.println("TestCase class default constructor");
        super.OpenBrowser();//invoking parent class method
        super.OpenBrowser("Firefox");//invoking parent class method with parameter
        super.CloseBrowser();//invoking parent class method
        super.setBrowser("Edge");//invoking parent class setter method
        super.getBrowser();//invoking parent class getter method
        super.OpenBrowser(super.getBrowser());//invoking parent class method with parameter using getter method
        super.OpenBrowser(super.getBrowser());//invoking parent class method with parameter using getter method


    }


}

