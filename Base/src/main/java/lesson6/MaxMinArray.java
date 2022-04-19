package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Введите размер массива: ");
        String newValue = scanner.nextLine();
        int value = Integer.parseInt(newValue);

        int[] mainArray = new int[value];
        for (int i = 0; i < value ; i++) {
            mainArray[i] = (int) Math.floor(Math.random() * 101);
        }
        System.out.println(Arrays.toString(mainArray));

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mainArray.length-1; i++) {
                if(mainArray[i] > mainArray[i+1]){
                    isSorted = false;

                    buf = mainArray[i];
                    mainArray[i] = mainArray[i+1];
                    mainArray[i+1] = buf;
                }
            }
        }
        double sred = 0;
        for (int number : mainArray){
            sred += number;
                    }
        sred /= mainArray.length;
        System.out.println("Наименьшее значение в массиве: " + mainArray[0]);
        System.out.println("Наибольшее значение в массиве: " + mainArray[mainArray.length - 1]);
        System.out.println("Среднее значение в массиве: " + sred);
    }

}
