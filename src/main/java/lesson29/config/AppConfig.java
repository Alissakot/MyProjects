package lesson29.config;
//
//import lesson29.LocalisationService;
//import lombok.SneakyThrows;
//import org.jline.utils.AttributedString;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.shell.jline.PromptProvider;
//
//@Configuration
//@EnableConfigurationProperties
//public class AppConfig {
//
//    @Bean
//    @SneakyThrows
//    public PromptProvider promptProvider(LocalisationService localisationService) {
//        return () -> new AttributedString(localisationService.localize("intro"));
//    }
//}