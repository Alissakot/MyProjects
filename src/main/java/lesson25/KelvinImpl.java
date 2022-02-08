package lesson25;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KelvinImpl implements Printable {
    final static Value scaleType = Value.KELVIN;
    private double count;

    @Override
    public void printResult() {
        System.out.println(count + " градусов по шкале " + scaleType + " соответствует " +
                (count - 273.15) + " градусов по шкале " + Value.CELSEUS);
        System.out.println(count + " градусов по шкале " + scaleType + " соответствует " +
                ((count - 273.15) * 9 / 5 + 32) + " градусов по шкале " + Value.FAHRENHEIT);
    }
}
