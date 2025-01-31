package funds;

public abstract class BankAccount {
    protected String accountId;
    protected String accountHolderName;
    protected double balance;
    protected String password;

    public BankAccount(String accountId, String accountHolderName, String password) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.password = password;
        this.balance = 0.0;
    }

    public abstract boolean login(String inputPassword);
    public abstract void addFunds(double amount);
    public abstract void removeFunds(double amount);
    public abstract void transferFunds(BankAccount recipient, double amount);
    public abstract void displayAccountDetails();

    public String getAccountId() { 
        return accountId;
    }
}