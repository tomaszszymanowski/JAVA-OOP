package innerClassRepo;

public class BankAccountsRepo {
    private Account[] accounts;
    private int accountIndex = 0;

    public BankAccountsRepo() {
        accounts = new Account[10];
    }

    public void add(Account account) {
        accounts[accountIndex++] = account;
    }

    public void displayAll() {
        for(int i = 0; i<accounts.length && accounts[i] != null; i++){
            accounts[i].display();
        }
    }

    public void findAccount(int accountNumber) {
        accounts[accountNumber].display();
    }
}
