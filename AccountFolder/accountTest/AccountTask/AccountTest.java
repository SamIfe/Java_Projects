package AccountTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest{
    private static Account account;

    @BeforeEach
    public void startEachTestWithThis(){
        account = new Account("Ifeoluwa", "34234");

    }
    public void testThatDeposit500Works(){
        account.deposit(500);
        assertEquals(account.getBalance(), 500);
    }
    @Test
    public void testForNegativeWithdrawal(){
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(3000, "353"));
    }

    @Test
    public void tesThatDeposit1kWithdraw1kWorks(){
        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(500, "34234");
        account.withdraw(500, "34234");
        assertEquals(account.getBalance(), 1000);
    }
    @Test
    public void testThatValidatePinWorksWithWithdrawal(){
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(500, "26634"));

    }


}
