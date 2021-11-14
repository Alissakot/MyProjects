package lesson5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String newValue = scanner.nextLine();
        int value = Integer.parseInt(newValue);
        result(value);
    }

    public static void result(int value) {
        int n1 = 0;
        int n2 = 1;
        int number;
        for (number = 1; number <= value - 2; number++) {
            n2 += n1;
            n1 = n2 - n1;

        }
        System.out.println("число Фибонначи " + n2);

    }
}
