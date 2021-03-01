package lab01.example.model;

/**
 * This class represent an abstract instance of a BankAccount.
 * In particular, an Abstract Bank Account allows to implement deposit() and withdraw
 * in order to represent a particular BanAccount.
 */
public abstract class AbstractBankAccount implements BankAccount {
    protected final AccountHolder holder;
    protected double balance;

    public AbstractBankAccount(final double balance, final AccountHolder holder) {
        this.balance = balance;
        this.holder = holder;
    }

    @Override
    public AccountHolder getHolder() {
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public abstract void deposit(int usrID, double amount);

    @Override
    public abstract void withdraw(int usrID, double amount);

    boolean isWithdrawAllowed(final double amount) {
        return this.balance >= amount;
    }

    boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
}
