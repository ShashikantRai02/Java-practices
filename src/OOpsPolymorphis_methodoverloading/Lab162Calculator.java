package OOpsPolymorphis_methodoverloading;

public class Lab162Calculator {
    public static void main(String[] args)
    {

        calc c=new calc();//object creation
//        c.add(10,20);
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.5,20.5));
        System.out.println(c.add(10000000000l,20000000000l));
    }}
    class calc{
        int add(int a,int b)
        {
            return a+b;
        }
        int add(double a,double b)
        {
            return (int)(a+b);
        }
        int add(long a,long b)
        {
            return (int)(a+b);
        }
    }

