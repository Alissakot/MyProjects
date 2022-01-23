import lesson21.Account;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class AccountTest {
    @Test
    public void shouldAccountCanDeposit (){
        Account account = new Account(new BigDecimal(1000));
        Assert.assertEquals(new BigDecimal(2000),account.deposit(new BigDecimal(1000)));
    }
    @Test
    public void shouldAccountCanWithdraw (){
        Account account = new Account(new BigDecimal(5000));
        Assert.assertEquals(new BigDecimal(3000),account.withdraw(new BigDecimal(2000)));
    }
}
