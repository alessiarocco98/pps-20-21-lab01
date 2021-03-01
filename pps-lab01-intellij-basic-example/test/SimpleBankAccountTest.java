import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest extends AbstractSimpleBankAccountTest {
    @BeforeEach
    void beforeEach() {
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccount(accountHolder, 0);
    }

    @Test
    void testDeposit(){
        AbstractSimpleBankAccountTest.testDeposit(100, 100);
    }

    @Test
    void testWrongDeposit(){
        AbstractSimpleBankAccountTest.testWrongDeposit(100, 100);
    }

    @Test
    void testWithdraw(){
        AbstractSimpleBankAccountTest.testWithdraw(100, 30);
    }

    @Test
    void testWrongWithdraw(){
        AbstractSimpleBankAccountTest.testWrongWithdraw(100.0, 100.0);
    }

}
