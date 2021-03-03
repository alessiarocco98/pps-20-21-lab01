import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test suite for testing the SimpleBankAccountWithAtm implementation
 */
public class SimpleBankAccountWithAtmTest extends AbstractSimpleBankAccountTest{
    private double initialAmount = 100;
    private double expectedDepositAmount = 99;
    private double expectedWithdrawtAmount = 28;
    private double depositAmount = 50;
    private double withdrawAmount = 70;
    private int usrID = 2;


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
        super.abstractTestWrongDeposit(initialAmount, expectedDepositAmount, usrID, depositAmount);
    }

    @Test
    void testWithdraw() {
        super.abstractTestWithdraw(initialAmount, expectedWithdrawtAmount, withdrawAmount);
    }

    @Test
    void testWrongWithdraw() {
        super.abstractTestWrongWithdraw(initialAmount, expectedDepositAmount, usrID, withdrawAmount);
    }
}
