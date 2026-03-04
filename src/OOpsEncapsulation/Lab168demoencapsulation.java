package OOpsEncapsulation;

public class Lab168demoencapsulation {
    public static void main(String[] args) {
        vwoLogin v=new vwoLogin("admin","admin123");
        System.out.println(v.username);
        System.out.println(v.password);
        v.password="admin1234";
        System.out.println(v.password);
        GoodvwoLogin g=new GoodvwoLogin("admin","admin123");
        System.out.println(g.getUsername());
        System.out.println(g.getPassword());


    }
}

class vwoLogin{
    public String username;
    public String password;
    public vwoLogin(String username,String password)
    {
        this.username=username;
        this.password=password;
    }
//     void login()
//     {
//         System.out.println("Login with username and password");
//     }
}
class GoodvwoLogin{
    private String username;
    private String password;

    public String getUsername() //getter method to access private variable
    {
        return username;
    }

    public void setUsername(String username) //setter method to modify private variable
    {
        this.username = username;
    }

    public String getPassword() //getter method to access private variable
    {
        return password;
    }

    public void setPassword(String password) //setter method to modify private variable
    {
        this.password = password;
    }

    public GoodvwoLogin(String username, String password)
    {
        this.username=username;
        this.password=password;
    }
//    void login()
//    {
//        System.out.println("Login with username and password");
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
