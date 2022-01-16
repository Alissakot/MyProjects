package lesson19;

import java.math.BigDecimal;

public class EntityAccount extends Account {

    public EntityAccount(String accountName, String accountID) {
        super(accountName, accountID);
    }

    private BigDecimal balance = BigDecimal.ZERO;

    @Override
    protected void deposit(BigDecimal money, String access) {
        this.balance = this.balance.add(money);
    }

    @Override
    protected void withdraw(BigDecimal money, String access) {
        this.balance = this.balance.subtract(money);
    }

    private BigDecimal getBalance() {
        return balance;
    }
}
