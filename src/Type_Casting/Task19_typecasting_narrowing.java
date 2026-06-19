package Type_Casting;

public class Task19_typecasting_narrowing {
    public static void main(String[] args)
    {
        long phone_number=1234567898l;
        //short s=phone_number;// narrowing implicit not valid
        short s=(short)phone_number;// narrowing explicit
        System.out.println(s);
    }
}
