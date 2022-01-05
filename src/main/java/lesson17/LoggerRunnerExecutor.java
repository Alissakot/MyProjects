package lesson17;

import lesson16.Logger;
import lesson16.LogsLevel;
import lesson16.Reader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LoggerRunnerExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(new Logger("Это говорит поток 0", LogsLevel.INFO));
        service.submit(new Logger("Это говорит поток 1", LogsLevel.ERROR));
        service.submit(new Logger("Это говорит поток 2", LogsLevel.WARN));
        service.shutdown();

        ScheduledExecutorService reader = Executors.newSingleThreadScheduledExecutor();
        reader.schedule(new Reader(), 60, TimeUnit.SECONDS);
        reader.shutdown();

    }
}

