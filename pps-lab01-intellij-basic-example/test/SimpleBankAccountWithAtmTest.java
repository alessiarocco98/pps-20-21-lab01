import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test suite for testing the SimpleBankAccountWithAtm implementation
 */
public class SimpleBankAccountWithAtmTest extends AbstractSimpleBankAccountTest{

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
        super.abstractTestDeposit(100, 99);
    }

    @Test
    void testWrongDeposit() {
        super.abstractTestWrongDeposit(100, 99);
    }

    @Test
    void testWithdraw() {
        super.abstractTestWithdraw(100, 28);
    }

    @Test
    void testWrongWithdraw() {
        super.abstractTestWrongWithdraw(100, 99);
    }
}
