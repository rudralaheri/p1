package funds;

public class OnceLoggedIn extends BankAccount {

    public OnceLoggedIn(String accountId, String accountHolderName, String password) {
        super(accountId, accountHolderName, password);
    }


    public boolean login(String inputPassword) {
        return this.password.equals(inputPassword);
    }

  
    public void addFunds(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " added to account " + accountId);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    
    public void removeFunds(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount + " removed from account " + accountId);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public void transferFunds(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            recipient.addFunds(amount);
            System.out.println("Transferred " + amount + " to " + recipient.getAccountId());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public void displayAccountDetails() {
        System.out.println("Account ID: " + this.accountId);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }
}