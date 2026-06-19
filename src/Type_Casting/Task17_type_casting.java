package Type_Casting;

public class Task17_type_casting {
    public static void main(String[] args)
    {
        byte b=10;
        //valid syntax -implicit-casting-widening
        int a=b; // valid syntax -implicit-casting-widening
        // this is called explicit casting
        int a1=(int) b;// valid syntax -explicit-casting-narrowing

        //int c=300;
        //byte d=c;
    }
}
