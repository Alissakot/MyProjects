package lesson22;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lesson18.InputStreamRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;

public class WeatherGetter {
    public static String cityName = "";
    public static String apiKey = "";

    public static void main(String[] args) throws URISyntaxException, IOException {
        Map<String, String> cities = new LinkedHashMap();
        try (BufferedReader keyReader = new BufferedReader(new InputStreamReader(InputStreamRunner.class.getResourceAsStream("/WeatherAPIKey.txt")))){
            apiKey = keyReader.readLine();
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(InputStreamRunner.class.getResourceAsStream("/Cities.txt")))) {
            String line = reader.readLine();
            while (line != null) {
                String[] str = line.split(",");
                cities.put(str[0].toLowerCase(), str[1].toLowerCase());
                line = reader.readLine();
            }
        }
        Scanner cityScanner = new Scanner(System.in);
        System.out.println("Для получения информации о погоде введите название города.");
        System.out.println("Для завершения программы введите \"стоп\".");
        String command = "";
        while (!command.equals("стоп")) {
            command = cityScanner.nextLine().toLowerCase();
            if (command.equals("стоп")) {
                return;
            }

            cityName = cities.get(command);
            if (cityName == null) {
                System.out.println("Город неверно введен или не найден.");
            } else {
                URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid="+ apiKey + "&units=metric");
                URL url = uri.toURL();
                URLConnection urlConnection = url.openConnection();
                urlConnection.connect();
                Scanner scanner = new Scanner(urlConnection.getInputStream());

                ObjectMapper mapper = new ObjectMapper();
                JsonNode root;
                String temp = "";
                String feelsLike = "";
                try {
                    root = mapper.readTree(scanner.nextLine());
                    temp = root.path("main").path("temp").asText();
                    feelsLike = root.path("main").path("feels_like").asText();

                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                System.out.println("В выбранном городе " + command + " температура " + temp + ". \n Ощущается как " + feelsLike);

            }
        }
    }
}