package lesson29.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.Locale;

@Data
@Component
@ConfigurationProperties("application")
public class ApplicationProperties {

    private SettingsProperties setting;

    @Data
    public static class SettingsProperties {
        private String name;
        private Locale locale;
    }
}