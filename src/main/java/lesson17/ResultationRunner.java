package lesson17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.*;

public class ResultationRunner extends Thread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(random.nextInt());
        }
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletableFuture<Integer> futureMax = CompletableFuture.supplyAsync(() -> {
            int threadMax;
            Iterator<Integer> iterator = numbers.iterator();
            threadMax = Integer.MIN_VALUE;
            while (iterator.hasNext()) {
                int count = iterator.next();
                if (count > threadMax) {
                    threadMax = count;
                }
            }
            return threadMax;
        }, executor);
        futureMax.join();
        CompletableFuture<Integer> futureMin = CompletableFuture.supplyAsync(() -> {
            int threadMin;
            Iterator<Integer> iterator = numbers.iterator();
            threadMin = Integer.MAX_VALUE;
            while (iterator.hasNext()) {
                int count = iterator.next();
                if (count < threadMin) {
                    threadMin = count;
                }
            }
            return threadMin;
        }, executor);
        futureMin.join();
        CompletableFuture<Double> futureAverage = CompletableFuture.supplyAsync(() -> {
            double sumList = 0;
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                sumList += iterator.next();
            }
            return sumList / numbers.size();
        }, executor);
        futureAverage.join();
        System.out.println(futureMax.get());
        System.out.println(futureMin.get());
        System.out.println(futureAverage.get());
        executor.shutdown();
    }
}
