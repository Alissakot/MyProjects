package lesson30.config;
//import lesson29.LocalisationService;
//import lombok.SneakyThrows;
//import org.jline.utils.AttributedString;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.shell.jline.PromptProvider;
//
//@Configuration
//@EnableConfigurationProperties
//@EntityScan("lesson30")
//public class AppConfig {
//    @Bean
//    @SneakyThrows
//    public PromptProvider promptProvider() {
//        return () -> new AttributedString("Для записи данных в базу введите \"save\", затем  данные в следующем порядке: \n" +
//                "название города на русском языке, название города на английском языке, численность населения,\n " +
//                "код города через пробел. Для чтения данных из базы введите \"find\", " +
//                "затем введите название города на русском или английском языке.\n ");
//    }
//}