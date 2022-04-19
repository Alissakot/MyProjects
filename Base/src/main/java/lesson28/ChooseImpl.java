package lesson28;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ChooseImpl implements Choose {
    public String choose() {
        Scanner chooseScanner = new Scanner(System.in);
        System.out.println("Если Вы хотите запаковать файл, введите 1");
        System.out.println("Для распаковки архива введите 2");
        return chooseScanner.nextLine();
    }
}