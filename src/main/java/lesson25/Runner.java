package lesson25;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        final CelseusImpl celseus = (CelseusImpl) context.getBean("converterFromCelseus");
        celseus.printResult();

        final FahrenheitImpl fahrenheit = (FahrenheitImpl) context.getBean("converterFromFahrenheit");
        fahrenheit.printResult();

        final KelvinImpl kelvin = (KelvinImpl) context.getBean("converterFromKelvin");
        kelvin.printResult();
    }
}
