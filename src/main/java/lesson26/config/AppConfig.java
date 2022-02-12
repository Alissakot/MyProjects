package lesson26.config;

import lesson26.Converter;
import lesson26.ConverterImpl;
import lesson26.CurrencyReferenceImpl;
import lesson26.CurrencyReference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("Lesson26")
public class AppConfig {
    @Bean("currencyReference")
    public CurrencyReference currencyReference() {
        return new CurrencyReferenceImpl();
    }

    @Bean("converter")
    public Converter converter() {
        return new ConverterImpl();
    }
}

