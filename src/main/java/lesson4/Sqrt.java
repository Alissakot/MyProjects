package lesson4;

import java.util.Scanner;

public class Sqrt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String newValue = scanner.nextLine();
        int value = Integer.parseInt(newValue);
        result(value);
    }

    public static void result(int value) {
        int n = 2;
        if (value == 1) {
            System.out.println("корень числа равен 1");
            return;
        }else if(value==0){
            System.out.println("корень числа равен нулю");
            return;
        }

        while (value >= n * n) {
            if (n * n == value) {
                System.out.println("корень числа " + value + " равен " + n);
                break;
            }
            n++;
        }
        if (n * n > value) {
            System.out.println("нет действительных корней");
        }

    }
}
