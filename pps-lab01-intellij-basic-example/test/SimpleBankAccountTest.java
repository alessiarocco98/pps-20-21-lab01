import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest extends AbstractSimpleBankAccountTest {
    private int initialAmount = 100;
    private int expectedDepositAmount = 100;
    private int expectedWithdrawtAmount = 30;

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
        super.abstractTestDeposit(initialAmount, expectedDepositAmount);
    }

    @Test
    void testWrongDeposit(){
        super.abstractTestWrongDeposit(initialAmount,expectedDepositAmount);
    }

    @Test
    void testWithdraw(){
        super.abstractTestWithdraw(initialAmount, expectedWithdrawtAmount);
    }

    @Test
    void testWrongWithdraw(){
        super.abstractTestWrongWithdraw(initialAmount,expectedDepositAmount);
    }

}
