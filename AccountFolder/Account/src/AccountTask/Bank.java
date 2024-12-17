package AccountTask;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int accountNumber;
    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String pin) {
        String name = firstName + " " + lastName;
        Account account = new Account(name, pin);
        accounts.add(account);
        this.accountNumber++;
        return account;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}


