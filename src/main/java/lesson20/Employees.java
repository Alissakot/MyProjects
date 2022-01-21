package lesson20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)

public class Employees {
    @XmlElement(name = "employee")
    public List<Employee> employees;
}
