package lesson10;


import static lesson10.value.*;

public interface printable {
    static void printResult(value scaleType, double count) {
        switch (scaleType) {
            case CELSEUS -> System.out.println(count + " градусов по Цельсию");
            case FAHRENHEIT -> System.out.println(count + " градусов по Фаренгейту");
            case KELVIN -> System.out.println(count + " Кельвинов");
        }
    }
}
