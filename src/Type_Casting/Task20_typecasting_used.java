package Type_Casting;

public class Task20_typecasting_used {
    public static void main(String[] args)
    {
        int course=100;
        float gst=18.5f;
        // int total1=course+gst;// narrowing implicit
        int total2=course+(int)gst;// narrowing explicit
        System.out.println(total2);
        float total3=course+gst;// widening auto implicit
        float total4=(float)course+gst;//widening explicit
        System.out.println(total4);

    }
}
