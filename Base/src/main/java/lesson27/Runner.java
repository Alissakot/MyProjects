package lesson27;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext ("lesson27");
        GroupImpl employee1 = appContext.getBean (EmployeeImpl.class, "Иванов Василий Петрович", "347", new BigDecimal (20000));
        GroupImpl employee2 = appContext.getBean (EmployeeImpl.class, "Юдин Петр Васильевич", "245", new BigDecimal (30000));
        employee1.printInfo ();
        employee2.printInfo ();

    }
}
