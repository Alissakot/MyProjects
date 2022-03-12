package lesson33.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

@Service
public class ApiConnector {
    public BigDecimal returnValue(String type) throws URISyntaxException, IOException {

        String JsonString = "";
        BigDecimal value = BigDecimal.ZERO;

        URI uri = new URI("https://www.cbr-xml-daily.ru/daily_json.js");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
        while (scanner.hasNext()) {
            JsonString += scanner.nextLine();
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root;
        try {
            root = mapper.readTree(JsonString);
            if (type.equals("USD")) {
                value = root.path("Valute").path("USD").path("Value").decimalValue();
            } else {
                value = root.path("Valute").path("EUR").path("Value").decimalValue();
            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return value;
    }
}
