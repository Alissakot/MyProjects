package lesson16;

public class LoggerRunner {

    public static void main(String[] args) throws InterruptedException {

        boolean work = true;

        Logger stream1 = new Logger("Это говорит поток 0", LogsLevel.INFO);
        Logger stream2 = new Logger("Это говорит поток 1", LogsLevel.ERROR);
        Logger stream3 = new Logger("Это говорит поток 2", LogsLevel.WARN);

        stream1.start();
        stream2.start();
        stream3.start();

        while (work) {
            if (!(stream1.isAlive() | stream2.isAlive() | stream3.isAlive())) {
                work = false;
                Reader thread = new Reader();
                thread.start();
            }
        }
    }
}

