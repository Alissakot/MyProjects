package lesson25;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CelseusImpl implements Printable {
    final static Value scaleType = Value.CELSEUS;
    private double count;

    @Override
    public void printResult() {
        System.out.println(count + " градусов по шкале " + scaleType + " соответствует " +
                ((count * 1.8) + 32) + " градусов по шкале " + Value.FAHRENHEIT);
        System.out.println(count + " градусов по шкале " + scaleType + " соответствует " +
                (count + 273.15) + " градусов по шкале " + Value.KELVIN);
    }
}
