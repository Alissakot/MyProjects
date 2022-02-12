package lesson26;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.util.Map;

public interface CurrencyReference {
    Map<String, BigDecimal> refresher() throws URISyntaxException, IOException;
}