package lesson26;

import lesson26.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ConverterImpl implements Converter {
    @Override
    public void scanner() throws IOException, URISyntaxException {
        String command = "";
        final AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        final CurrencyReference currencyReference = (CurrencyReference) annotationConfigApplicationContext.getBean("currencyReference");
        Map currency = currencyReference.refresher();
        Scanner currencyScanner = new Scanner(System.in);
        while (!command.equals("STOP")) {
            System.out.println("Введите трехбуквенное обозначение валюты, курс которой хотите узнать; " +
                    "для завершения работы программы введите stop");
            command = currencyScanner.nextLine().toUpperCase(Locale.ROOT);
            if (command.equals("STOP")) {
                return;
            } else {
                System.out.println(currency.get(command));
            }
        }
    }
}

