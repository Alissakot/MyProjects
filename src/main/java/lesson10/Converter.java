package lesson10;

public class Converter implements Printable {
    public static void execute(Value originScaleType, Value targetScaleType, double count) {
        switch (originScaleType) {
            case CELSEUS -> executeCelseus(targetScaleType, count);
            case FAHRENHEIT -> executeFahrenheit(targetScaleType, count);
            case KELVIN -> executeKelvin(targetScaleType, count);
        }
    }
    public static void executeCelseus(Value targetScaleType, double count) {
        switch (targetScaleType) {
            case CELSEUS -> Printable.printResult(targetScaleType, count);
            case FAHRENHEIT -> Printable.printResult(targetScaleType, (count * 1.8) + 32);
            case KELVIN -> Printable.printResult(targetScaleType, count + 273.15);
        }
    }
    public static void executeFahrenheit (Value targetScaleType, double count) {
        switch (targetScaleType) {
            case CELSEUS -> Printable.printResult(targetScaleType, (count-32)/1.8);
            case FAHRENHEIT -> Printable.printResult(targetScaleType, count);
            case KELVIN -> Printable.printResult(targetScaleType, (count-32)*5.9+273.15);
        }
    }
    public static void executeKelvin (Value targetScaleType, double count) {
        switch (targetScaleType) {
            case CELSEUS -> Printable.printResult(targetScaleType, count- 273.15);
            case FAHRENHEIT -> Printable.printResult(targetScaleType, (count-273.15)*9.5-32);
            case KELVIN -> Printable.printResult(targetScaleType, count);
        }
    }
}