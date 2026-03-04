package OOpsEncapsulation;

public class Lab169RealBank {
    public static void main(String[] args) {
        SBIBank sbi=new SBIBank("SBI",1000000);
        System.out.println("Bank Name: "+sbi.getName());
        System.out.println("Bank Balance: "+sbi.getBalance());
        sbi.setBalance(2000000,false);
            System.out.println("Bank Balance: "+sbi.getBalance());
            sbi.setBalance(2000000,true);
            System.out.println("Bank Balance: "+sbi.getBalance());

    }

}
class SBIBank {
    private String name;
    private long balance;

    public SBIBank(String name, long balance)//constructor to initialize private variables
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName()//getter method to access private variable
    {
        return name;
    }

    public void setName(String name) //setter method to modify private variable
    {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean ifCashier) //setter method to modify private variable
    {
        if (ifCashier) {
            this.balance = balance;
        } else {
            System.out.println("Only cashier can update the balance");
        }
//        this.balance = balance;
    }
}



