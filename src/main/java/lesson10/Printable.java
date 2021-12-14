package lesson10;

public interface Printable {
    static void printResult(Value scaleType, double count) {
        switch (scaleType) {
            case CELSEUS -> System.out.println(count + " градусов по Цельсию");
            case FAHRENHEIT -> System.out.println(count + " градусов по Фаренгейту");
            case KELVIN -> System.out.println(count + " Кельвинов");
        }
    }
}
