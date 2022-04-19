package lesson20;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Employee {
    public String fio = "";
    public String login;
    public int id = 0;
    public Headquarter headquarter;
    public Vacancy vacancy;
}
