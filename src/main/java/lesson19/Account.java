package lesson19;

import java.math.BigDecimal;

public abstract class Account {

    private final String AccountName;
    private final String AccountID;

    public Account(String accountName, String accountID) {
        AccountName = accountName;
        AccountID = accountID;
    }

    @Blocked
    protected abstract void deposit(BigDecimal money, String access);

    @Blocked
    protected abstract void withdraw(BigDecimal money, String access);

}
