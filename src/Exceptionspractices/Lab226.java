package Exceptionspractices;

public class Lab226 {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try{
            c=10/a;
            String s1=null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
         catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
