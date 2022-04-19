package lesson20;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor

public class Vacancy {
    public String vacancy;
    public BigDecimal salary;
}
