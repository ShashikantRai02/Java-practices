package Exceptionspractices;

public class Lab228Exceptions {
    public static void main(String[] args) {
        try {
            String ip=args[0];
            int a=Integer.parseInt(args[1]);
            int b=100/a;
            System.out.println(b);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
