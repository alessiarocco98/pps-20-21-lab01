import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleBankAccountWithAtmTest extends AbstractSimpleBankAccountTest{

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Andrea", "Bianchi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

    @Test
    void testDeposit() {
        super.testDeposit(100, 99);
    }

    @Test
    void testWrongDeposit() {
        super.testWrongDeposit(100, 99);
    }

    @Test
    void testWithdraw() {
        super.testWithdraw(100, 28);
    }

    @Test
    void testWrongWithdraw() {
        super.testWrongWithdraw(100, 99);
    }
}
