import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void testInitialBalance() {
        super.abstractTestInitialBalance();
    }
    @Test
    void testDeposit(){
        super.abstractTestDeposit(100, 100);
    }

    @Test
    void testWrongDeposit(){
        super.abstractTestWrongDeposit(100,100);
    }

    @Test
    void testWithdraw(){
        super.abstractTestWithdraw(100, 30);
    }

    @Test
    void testWrongWithdraw(){
        super.abstractTestWrongWithdraw(100,100);
    }

}
