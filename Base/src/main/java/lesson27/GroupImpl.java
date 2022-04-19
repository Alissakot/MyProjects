package lesson27;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Scope("singleton")
@Service
public class GroupImpl implements Group {
    public String name;
    public String id;
    public BigDecimal salary;

    @Override
    public void printInfo() {
        System.out.println (this.name + " " + this.id + " " + this.salary);
    }

}
