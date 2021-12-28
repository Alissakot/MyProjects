package lesson16;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Logger extends Thread {
    String message;
    LogsLevel logsLevel;

    public Logger(String message, LogsLevel logsLevel) {
        this.message = message;
        this.logsLevel = logsLevel;
    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();
        long finishTime;

        Random random = new Random();
        boolean run = true;

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

        while (run) {
            Date dateNow = new Date();
            try (FileWriter writer = new FileWriter("C:\\Users\\urban\\Downloads\\test.txt", true)) {
                writer.write(formatForDateNow.format(dateNow) + " " + this.logsLevel + " " + this.getName() + " " + this.message);
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            } finally {
                try {
                    Thread.sleep(random.nextInt(5000));
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
            finishTime = System.currentTimeMillis();
            if (finishTime - startTime >= 60000) {
                run = false;
            }
        }
    }
}
