package lesson4;

import java.util.Scanner;

public class Sqrt {
    public static int value;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String newValue = scanner.nextLine();
        value = Integer.parseInt(newValue);
        result();
    }

    public static void result() {
        int n = 2;
        if (value <= 0) {
            if (value == 1) {
                System.out.println("корень числа " + 1);
                return;
            }
            while (value >= n * n) {
                if (n * n == value) {
                    System.out.println("корень числа " + value + " " + n);
                    break;
                }
                n++;
            }
            if (n * n > value) {
                System.out.println("нет действительных корней");
            }
        } else {
            System.out.println("нет действительных корней");
        }
    }
}
