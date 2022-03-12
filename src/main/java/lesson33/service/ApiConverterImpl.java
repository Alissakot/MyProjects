package lesson33.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URISyntaxException;

@Service
public class ApiConverterImpl implements ApiConverter {

    ApiConnector connector = new ApiConnector();

    public BigDecimal getValue(BigDecimal count, String type) throws URISyntaxException, IOException {

        BigDecimal finalValue;

        if (type.equals("RubToUSD") || type.equals("USDToRub")) {
            BigDecimal value = connector.returnValue("USD");
            if (type.equals("RubToUSD")) {
                finalValue = count.divide(value, 4, RoundingMode.CEILING);
            } else {
                finalValue = count.multiply(value);
            }
        } else {
            BigDecimal value = connector.returnValue("EUR");
            if (type.equals("RubToEUR")) {
                finalValue = count.divide(value, 4, RoundingMode.CEILING);
            } else {
                finalValue = count.multiply(value);
            }
        }
        return finalValue;
    }

}
