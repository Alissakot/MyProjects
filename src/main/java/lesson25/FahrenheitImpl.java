package lesson25;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FahrenheitImpl implements Printable {
    final static Value scaleType = Value.FAHRENHEIT;
    private double count;

    @Override
    public void printResult() {
        System.out.println(count + " градусов по шкале " + scaleType + " соответствует " +
                ((count - 32) / 1.8) + " градусов по шкале " + Value.CELSEUS);
        System.out.println(count + " градусов по шкале " + scaleType + " соответствует " +
                ((count - 32) * 5 / 9 + 273.15) + " градусов по шкале " + Value.KELVIN);
    }
}
