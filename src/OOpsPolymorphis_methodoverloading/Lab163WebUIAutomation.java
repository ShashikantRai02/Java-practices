package OOpsPolymorphis_methodoverloading;

public class Lab163WebUIAutomation {
    public static void main(String[] args) {
        WebUIAutomation w=new WebUIAutomation();
        w.login("admin","admin123");
        w.login("admin","admin123","google");
        w.login("admin","admin123","google","chrome");
    }}
class WebUIAutomation{
    void login(String username,String password)
    {
        System.out.println("Login with username and password");
    }
    void login(String username,String password,String website)
    {
        System.out.println("Login with username,password and website");
    }
    void login(String username,String password,String website,String browser)
    {
        System.out.println("Login with username,password,website and browser");
    }}

