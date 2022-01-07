package lesson18;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamRunner {

    @SneakyThrows({IOException.class})
    public static void main(String[] args) {

        int fileCount = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(InputStreamRunner.class.getResourceAsStream("/file.txt")))) {
            String line = reader.readLine();
            while (line != null) {
                fileCount += 1;
                try (FileWriter writer = new FileWriter("C:\\Users\\urban\\Downloads\\string" + fileCount + ".txt")) {
                    writer.write(line);
                }
                line = reader.readLine();
            }
        }
    }
}