package Exceptionspractices;

public class Lab230 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setCurrency("USD");
        bank.setAmount(1000);

        try {
            bank.deposit(500);
            bank.deposit(-200); // This will throw an exception
        } catch (Exception e) {
            System.out.println("InvalidAmountException: " + e.getMessage());
        }
    }
}
class Bank{
    private String currency;
    private Integer amount;
    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;

    }

    public Bank() {

    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer deposit(Integer amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Deposit amount must be greater than zero");
        }
        this.amount += amount;
        System.out.println("Deposit successful. Current balance: " + this.amount);
        return this.amount;
    }
    //    public void withdraw(int amount) throws InsufficientFundsException {
//        int balance = 1000; // Example balance
//        if (amount > balance) {
//            throw new InsufficientFundsException("Insufficient funds for withdrawal");
//        }
//        balance -= amount;
//        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

