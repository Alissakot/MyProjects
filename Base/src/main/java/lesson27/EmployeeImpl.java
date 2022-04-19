package lesson27;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
@Service
public class EmployeeImpl extends GroupImpl implements Employee {

    public EmployeeImpl(String name, String id, BigDecimal salary) {
        super (name, id, salary);
    }

}
