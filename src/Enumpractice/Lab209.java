package Enumpractice;

public class Lab209 {
    public static void main(String[] args) {
        Hexcolor c=Hexcolor.RED;
        System.out.println("Color: " + c);
        System.out.println("Hex code for " + c + ": " + c.getHexcode());
        Hexcolor c2=Hexcolor.GREEN;
        System.out.println("Color: " + c2);
        System.out.println("Hex code for " + c2 + ": " + c2.getHexcode());
    }
}
enum Hexcolor{
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
    private String hexcode;// instance variable to hold the hex code for each constant
    private Hexcolor(String hexcode)// constructor to initialize the hex code for each constant
    {
        this.hexcode=hexcode;
    }
    public String getHexcode()// method to retrieve the hex code for each constant
    {
        return hexcode;
    }
}
