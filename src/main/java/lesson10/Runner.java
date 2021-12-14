package lesson10;

import static lesson10.Converter.execute;

public class Runner {
    public static void main(String[] args) {

        Value originScaleType = Value.FAHRENHEIT;
        Value targetScaleType = Value.KELVIN;
        double count = 1;

        Printable.printResult(originScaleType, count);
        System.out.println("----------||--------");
        execute(originScaleType, targetScaleType, count);
    }
}
