package OOPsSuperkeywords;

public class Lab187super {
}
class Father{
    Father(){
        System.out.println("Father class constructor");
    }
    int gold = 100;
    void home(){
        System.out.println("Father class method");
    }
}
class Son extends Father{
    Son(){
        super();
        System.out.println("Son class constructor");
    }
    void bike(){

        System.out.println("Bike inherited from father: "+super.gold);
    }
    void home(){
        super.home();
        System.out.println("Son class method");
    }
    void display(){
        System.out.println("Gold inherited from father: "+super.gold);
    }

    void newhome(){
        super.home();
        this.bike();
    }
    public static void main(String[] args) {
        Son s = new Son();
        s.home();
        s.display();
        s.bike();
    }
}
