package lesson21;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public BigDecimal deposit(BigDecimal money) {
        this.balance = this.balance.add(money);
        return this.balance;
          }

    public BigDecimal withdraw(BigDecimal money) {
        if (this.balance.compareTo(money) == -1) {
            System.out.println("Недостаточно средств на счете. Попробуйте снять сумму меньше");}
        else{
            this.balance = this.balance.subtract(money);
        }
        return this.balance;
        }

 }
