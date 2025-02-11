import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void deposit() {
        account.deposit(100);
        assertEquals(100, account.getCurrentBalance());
        account.deposit(50);
        assertEquals(150, account.getCurrentBalance());
        account.deposit(-50);
        assertEquals(150, account.getCurrentBalance());
    }

    @Test
    void withdraw() {
        account.deposit(100);
        assertEquals(50, account.withdraw(50));
        assertEquals(50, account.getCurrentBalance());
        assertEquals(0, account.withdraw(100));
        assertEquals(50, account.getCurrentBalance());
        assertEquals(0, account.withdraw(-50));
        assertEquals(50, account.getCurrentBalance());
    }

    @Test
    void getBalance() {
        assertEquals(0, account.getCurrentBalance());
        account.deposit(100);
        assertEquals(100, account.getCurrentBalance());
        account.withdraw(50);
        assertEquals(50, account.getCurrentBalance());
    }
}