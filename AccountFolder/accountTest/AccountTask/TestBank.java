package AccountTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    public void testThatAccountCanGenerateAccountNumber() {
        Bank bank = new Bank();
        Account account = bank.createAccount("Ifeoluwa", "Samuel", "19900");
        assertEquals(1, bank.getAccountNumber());

    }

}
