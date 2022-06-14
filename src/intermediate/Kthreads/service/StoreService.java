package intermediate.Kthreads.service;

import java.util.concurrent.*;

public class StoreService {

    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPricesSync(String storeName){
        System.out.printf("Getting prices syncfor store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPrincesFutureAsync(String storeName){
        System.out.printf("Getting prices syncfor store %s%n", storeName);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPrincesCompletableFutureAsync(String storeName){
        System.out.printf("Getting prices syncfor store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }



    private double priceGenerator() {
        System.out.println("generating price "+Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }


    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
