package lesson2;

public class formula {

    public static void main(String[] args) {

        System.out.println("Сила Кулона равна: " + kulonLaw(4.2,3.5,0.2) + " Н");

    }

    /**
     * Закон Кулона
     * @param q1 величина заряда первого тела, Кл
     * @param q2 величина заряда второго тела, Кл
     * @param r расстояние между двумя телами, м
     * @return сила Кулона, Н
     */
    public static double kulonLaw(double q1, double q2, double r) {

        double k = 9 * Math.pow(10,9); //постоянная величина, Н * м^2 / Кл^2
        double F = k * q1 * q2 / Math.pow(r,2);

        return F;

    }
}
