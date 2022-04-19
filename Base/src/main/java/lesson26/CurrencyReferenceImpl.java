package lesson26;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyReferenceImpl implements CurrencyReference {
    @Override
    public Map<String, BigDecimal> refresher() throws IOException, URISyntaxException {
        Map<String, BigDecimal> baseMap = new HashMap<>();
        String JsonString = "";

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
            root.path("Valute").forEach(s -> baseMap.put(s.path("CharCode").asText(), s.path("Value").decimalValue()));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return baseMap;
    }
}
