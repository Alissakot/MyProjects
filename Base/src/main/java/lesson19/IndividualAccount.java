package lesson19;

import java.math.BigDecimal;

public class IndividualAccount extends Account implements Blockable {

    private BigDecimal balance = BigDecimal.ZERO;

    public IndividualAccount(String accountName, String accountID) {
        super(accountName, accountID);
    }

    @Blocked
    @Override
    public void deposit(BigDecimal money, String access) {
        this.balance = this.balance.add(money);
    }

    @Blocked
    @Override
    public void withdraw(BigDecimal money, String access) {
        this.balance = this.balance.subtract(money);
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
