package lesson19;

import java.math.BigDecimal;

public interface Blockable {
    //    @Blocked (access = "true")
//    public void block ();
    void deposit(BigDecimal money, String access);

    void withdraw(BigDecimal money, String access);
}
