package lesson6;

import java.util.Scanner;

public class massivFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "exit";
        int[] massiv = new int[2];
        massiv[0] = 0;
        massiv[1] = 1;
        String command = "";
        while (!command.equals(exit)) {
            System.out.println("Введите длину ряда Фибоначчи или для окончания работы введите exit");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();

                if (value <= 0 || value > 47) {
                    System.out.println("Введите число больше 0 и меньше 48");
                    continue;
                } else if (value <= massiv.length) {
                    System.out.println("Числом в ряду Фибоначчи под номером " + value + " является " + massiv[value - 1]);
                    continue;
                }
                int[] massiv1 = new int[value];
                System.arraycopy(massiv, 0, massiv1, 0, massiv.length);
                for (int i = massiv.length; i < massiv1.length; i++) {
                    massiv1[i] = massiv1[i - 2] + massiv1[i - 1];
                }
                massiv = new int[massiv1.length];
                System.arraycopy(massiv1, 0, massiv, 0, massiv1.length);
                System.out.println("Числом в ряду Фибоначчи под номером " + value + " является " + massiv[value - 1]);

            } else {
                command = scanner.next();
                continue;
            }
        }
    }

}
