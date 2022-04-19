package lesson3;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(-1));
    }

    public static String factorial(int n) {
        boolean check = n >= 0;
        if (check) {
            long fn = 1;
            while (n > 0) {
                fn *= n;
                n--;
            }
            return String.valueOf(fn);
        }

        char symbol = '\u221e';

        return String.valueOf(symbol);

    }
}
