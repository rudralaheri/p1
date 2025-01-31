package funds;

import java.util.ArrayList;

public class CreateAccount {
    private ArrayList<OnceLoggedIn> accounts;

  
    public CreateAccount() { //constructor
        accounts = new ArrayList<>();
    }

 
    public void createAccount(String accountId, String accountHolderName, String password) {
        if (findAccountById(accountId) != null) { //check for existing accounts
            System.out.println("Account ID already exists. Please choose a different ID.");
            return;
        }
        OnceLoggedIn newAccount = new OnceLoggedIn(accountId, accountHolderName, password);
        accounts.add(newAccount);
        System.out.println("Account created successfully for " + accountHolderName);
    }

   
    public OnceLoggedIn findAccountById(String accountId) {
        for (OnceLoggedIn account : accounts) {//for each loop (temp data:arraylist)
            if (account.getAccountId().equals(accountId)) {
                return account;
            }
        }
        return null; //means that account not found
    }
}