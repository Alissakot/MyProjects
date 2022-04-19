package lesson12;

public class CheckArrayRunner {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        double randomString;
        String[][] mainMatrix = new String[n][m];
        for (int i = 0;i < n;i++){
            for (int j = 0; j < m;j++){
                randomString = Math.random() * 100;
                if (randomString > 30 & randomString < 35){ //пускай в этих границах будет вставать строка вместо числа
                    mainMatrix[i][j] = "Строка";
                } else {
                    mainMatrix[i][j] = String.valueOf((int)randomString);
                }
            }
        }
        CheckArray.checkArray(mainMatrix);
    }
}
