package ExtraPracticesExceptions;



public class Lab246 {
    public static void main(String[] args) {
        Lab246 labFinalize = new Lab246();
        labFinalize = null;
        System.gc();
        System.out.println("main method done");
    }

    @Override
    public void finalize(){
        System.out.println("Finalize method called before GC");
    }
}
