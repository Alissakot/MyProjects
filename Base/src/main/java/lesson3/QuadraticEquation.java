package lesson3;

public class QuadraticEquation {

    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения вида: a*x^2 + b*x + c = 0");
        System.out.println(solve(1,6,9));
    }

    public static String solve(double a, double b, double c) {

        boolean zero = a == 0;


        if (zero) {
            return "Первый коэффициент не может быть равен нулю";
        }

        double D = Math.pow(b,2) - 4 * a * c;
        boolean cantSolve = D < 0;

        if (cantSolve) {
            return "Нет действительных решений уравнения";
        }

        double x1 = (- b + Math.sqrt(D)) / 2 * a;
        double x2 = (- b - Math.sqrt(D)) / 2 * a;

        return x1  + " , " + x2;
    }
}
