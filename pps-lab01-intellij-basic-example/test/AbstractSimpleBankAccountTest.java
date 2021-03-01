import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractSimpleBankAccountTest {
    protected static AccountHolder accountHolder;
    protected static BankAccount bankAccount;


    @Test
    void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    static void testDeposit(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    @Test
    static void testWrongDeposit(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.deposit(2, 50);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    @Test
    static void testWithdraw(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.withdraw(accountHolder.getId(), 70);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    @Test
    static void testWrongWithdraw(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.withdraw(2, 70);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }
}
