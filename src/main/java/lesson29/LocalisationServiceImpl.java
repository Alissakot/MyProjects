package lesson29;

import lesson29.config.ApplicationProperties;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
@Service
public class LocalisationServiceImpl implements LocalisationService {

    private final MessageSource messageSource;
    private final Locale locale;

    public LocalisationServiceImpl(MessageSource messageSource, ApplicationProperties applicationProperties) {
        this.messageSource = messageSource;
        this.locale = applicationProperties.getSetting().getLocale();
    }

    @Override
    public String localize(String key, Object... vars) {
        return messageSource.getMessage(key, vars, locale);
    }
}