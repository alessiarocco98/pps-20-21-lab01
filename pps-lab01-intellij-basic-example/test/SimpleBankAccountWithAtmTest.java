import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test suite for testing the SimpleBankAccountWithAtm implementation
 */
public class SimpleBankAccountWithAtmTest extends AbstractSimpleBankAccountTest{
    private int initialAmount = 100;
    private int expectedDepositAmount = 99;
    private int expectedWithdrawtAmount = 28;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Andrea", "Bianchi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

    @Test
    void testInitialBalance() {
        super.abstractTestInitialBalance();
    }

    @Test
    void testDeposit() {
        super.abstractTestDeposit(initialAmount, expectedDepositAmount);
    }

    @Test
    void testWrongDeposit() {
        super.abstractTestWrongDeposit(initialAmount, expectedDepositAmount);
    }

    @Test
    void testWithdraw() {
        super.abstractTestWithdraw(initialAmount, expectedWithdrawtAmount);
    }

    @Test
    void testWrongWithdraw() {
        super.abstractTestWrongWithdraw(initialAmount, expectedDepositAmount);
    }
}
