package OOPsStatic;

public class Lab203Real {
    public static void main(String[] args) {
        System.out.println("Main method of Lab203 executed");
        ATB14x1.doassignment();
        ATB14x1 a = new ATB14x1();
        a.readdocuments();
    }
}
class ATB14x1{

    {
        System.out.println("Instance block of class ATB14x1 executed");
        System.out.println("you can write a code reading excel file or database connection");
    }
    static {
        System.out.println("LOad the class ATB14x1");
    }
    private String name="John Dow";
    private String company="ATB14x1";
    static String courseName="Java OOPs";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ATB14x1.courseName = courseName;
    }
    void readdocuments(){
        System.out.println("Documents read successfully");
    }
    static void doassignment(){
        System.out.println("Assignment done successfully");
//        System.out.println(company);// Accessing static variable directly
    }
}
