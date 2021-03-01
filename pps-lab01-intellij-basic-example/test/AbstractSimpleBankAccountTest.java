import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractSimpleBankAccountTest {
    protected AccountHolder accountHolder;
    protected BankAccount bankAccount;

    void abstractTestInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    void abstractTestDeposit(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    void abstractTestWrongDeposit(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.deposit(2, 50);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    void abstractTestWithdraw(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.withdraw(accountHolder.getId(), 70);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    void abstractTestWrongWithdraw(double initialAmount, double expectedAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.withdraw(2, 70);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }
}
