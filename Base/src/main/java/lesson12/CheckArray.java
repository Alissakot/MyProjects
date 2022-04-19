package lesson12;

import lesson12.exceptions.MyArrayDataException;
import lesson12.exceptions.MySizeArrayException;

public class CheckArray {
    private static final int SIZE = 4;
    public static void checkArray(String[][] mainArray) throws MyArrayDataException {
        int sum = 0;
        String lastCell = "";
        if (mainArray.length != SIZE || mainArray[0].length != SIZE){
            throw new MySizeArrayException("Некорректный размер входной матрицы");
        }
        try{
            for (int i = 0;i < mainArray.length;i++){
                for (int j = 0; j < mainArray[0].length;j++){
                    lastCell = "[" + i + "][" + j + "]";
                    sum += Integer.parseInt(mainArray[i][j]);
                }
            }
            System.out.println("Сумма матрицы равна: " + sum);
        }
        catch (NumberFormatException ex){
            throw new MyArrayDataException("В ячейке " + lastCell + " содержатся данные с неверным типом");
        }

    }


}
