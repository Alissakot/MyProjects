package lesson15;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String newValue = text.nextLine();
        Stream<String> stream = Stream.of(newValue).flatMap(s -> Arrays.asList(s.split("\\PL+")).stream())
                .filter(w -> w.length() > 0).map(String::toLowerCase);
        Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> {
                            throw new IllegalStateException();
                        },
                        LinkedHashMap::new
                ));
        map.forEach((k, v) -> System.out.println(k));
    }
}
