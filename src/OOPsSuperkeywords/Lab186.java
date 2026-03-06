package OOPsSuperkeywords;

public class Lab186 {
}
class BaseClass1{
    BaseClass1(String browser){
        this.browser = browser;
    }
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
    void openBrowser(){
        System.out.println("Opening the browser: "+browser);
    }
    void openBrowser(String browser){
        this.browser = browser;
        System.out.println("Opening the browser: "+browser);
    }

    protected void closebrowser() {
    }
}
class TestClass1 extends BaseClass1{
    void testcase1(){
        super.setBrowser("Chrome");
        super.openBrowser();
    }
    public TestClass1(String browser) {
        super(browser);
    }
     void testcase2(){
         super.openBrowser("Firefox");
         super.openBrowser();
         super.openBrowser("Edge");
         super.openBrowser();
         super.openBrowser("Opera");
         super.openBrowser();
         super.openBrowser();
         super.closebrowser();
         System.out.println("Closing the browser: "+super.getBrowser());

     }

}
