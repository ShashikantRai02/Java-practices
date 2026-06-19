package Type_Casting;

public class Task18_typecasting_narrowing {
    public static void main(String[] args)
    {
        int val=300;
        //byte b=val;// Narrowing implicit casting valid?No
        byte b=(byte)val;// Narrowing -explicit casting -valid
        System.out.println(b);


    }
}
