package lesson10;

public class converter implements printable{
    public static void main(String[] args) {

        value originScaleType = value.FAHRENHEIT;
        value targetScaleType = value.KELVIN;
        double count = 35;

        printable.printResult(originScaleType, count);
        System.out.println("----------||--------");
        execute(originScaleType, targetScaleType, count);

    }

    public static void execute(value originScaleType, value targetScaleType, double count) {
        switch (originScaleType) {
            case CELSEUS -> executeCelseus(targetScaleType, count);
            case FAHRENHEIT -> executeFahrenheit(targetScaleType, count);
            case KELVIN -> executeKelvin(targetScaleType, count);
        }
    }
    public static void executeCelseus(value targetScaleType, double count) {
        switch (targetScaleType) {
            case CELSEUS -> printable.printResult(targetScaleType, count);
            case FAHRENHEIT -> printable.printResult(targetScaleType, (count * 1.8) + 32);
            case KELVIN -> printable.printResult(targetScaleType, count + 273.15);
        }
    }
    public static void executeFahrenheit (value targetScaleType, double count) {
        switch (targetScaleType) {
            case CELSEUS -> printable.printResult(targetScaleType, (count-32)/1.8);
            case FAHRENHEIT -> printable.printResult(targetScaleType, count);
            case KELVIN -> printable.printResult(targetScaleType, (count-32)*5.9+273.15);
        }
    }
    public static void executeKelvin (value targetScaleType, double count) {
        switch (targetScaleType) {
            case CELSEUS -> printable.printResult(targetScaleType, count- 273.15);
            case FAHRENHEIT -> printable.printResult(targetScaleType, (count-273.15)*9.5-32);
            case KELVIN -> printable.printResult(targetScaleType, count);
        }
    }
}