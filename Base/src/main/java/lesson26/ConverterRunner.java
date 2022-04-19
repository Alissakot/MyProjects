package lesson26;

import lesson26.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.net.URISyntaxException;

public class ConverterRunner {
    public static void main(String[] args) throws IOException, URISyntaxException {
        final AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        final Converter converter = (Converter) annotationConfigApplicationContext.getBean("converter");
        converter.scanner();
    }
}