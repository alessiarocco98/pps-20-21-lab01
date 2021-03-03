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

    void abstractTestWrongDeposit(double initialAmount, double expectedAmount, int usrID, double depositAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.deposit(usrID, depositAmount);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    void abstractTestWithdraw(double initialAmount, double expectedAmount, double withdrawAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.withdraw(accountHolder.getId(), withdrawAmount);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    void abstractTestWrongWithdraw(double initialAmount, double expectedAmount, int usrID, double withdrawAmount) {
        bankAccount.deposit(accountHolder.getId(), initialAmount);
        bankAccount.withdraw(usrID, withdrawAmount);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }
}
