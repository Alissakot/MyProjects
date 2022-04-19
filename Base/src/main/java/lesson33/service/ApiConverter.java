package lesson33.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;

public interface ApiConverter {
    BigDecimal getValue(BigDecimal count, String type) throws URISyntaxException, IOException;
}
