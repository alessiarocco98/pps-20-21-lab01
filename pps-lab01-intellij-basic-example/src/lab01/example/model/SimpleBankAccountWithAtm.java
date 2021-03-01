package lab01.example.model;

/**
 * This class represent a particular instance of a BankAccount.
 * In particular, a Simple Bank Account allowing the deposit and withdraw using the ATM.
 * Each transaction done with the ATM implies paying a 1$ fee.
 */
public class SimpleBankAccountWithAtm extends SimpleBankAccount{

    private final int fee = 1;

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }

    @Override
    public void deposit(int usrID, double amount) {
        if (checkUser(usrID)) {
            this.balance += amount;
            payingFee();
        }
    }

    @Override
    public void withdraw(int usrID, double amount) {
        if (checkUser(usrID) && isWithdrawAllowed(amount + 1)) {
            this.balance -= amount;
            payingFee();
        }
    }

    private void payingFee() {
        this.balance -= fee;
    }

}
