package intermediate.Kthreads.test;

import intermediate.Kthreads.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class KCompletableFutureTes01 {
    public static void main(String[] args) {

        StoreService storeService = new StoreService();
//        seachPrincesSync(storeService);
        seachPrincesFutureAsync(storeService);
        System.out.println("-----------------");
        seachPrincesCompletableFutureAsync(storeService);
    }

    private static void seachPrincesSync(StoreService service) {
        long start = System.currentTimeMillis();
        System.out.println(service.getPricesSync("Store 1"));
        System.out.println(service.getPricesSync("Store 2"));
        System.out.println(service.getPricesSync("Store 3"));
        System.out.println(service.getPricesSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.println("Time passed to seachPrincesSync " + (end - start));
    }


    private static void seachPrincesFutureAsync(StoreService service) {
        Future<Double> princesFutureAsync1 = service.getPrincesFutureAsync("Store 1");
        Future<Double> princesFutureAsync2 = service.getPrincesFutureAsync("Store 2");
        Future<Double> princesFutureAsync3 = service.getPrincesFutureAsync("Store 3");
        Future<Double> princesFutureAsync4 = service.getPrincesFutureAsync("Store 4");
        long start = System.currentTimeMillis();
        try {
            System.out.println(princesFutureAsync1.get());
            System.out.println(princesFutureAsync2.get());
            System.out.println(princesFutureAsync3.get());
            System.out.println(princesFutureAsync4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time passed to seachPrincesSync " + (end - start));
        StoreService.ex.shutdown();
    }

    private static void seachPrincesCompletableFutureAsync(StoreService service) {
        CompletableFuture<Double> princesFutureAsync1 = service.getPrincesCompletableFutureAsync("Store 1");
        CompletableFuture<Double> princesFutureAsync2 = service.getPrincesCompletableFutureAsync("Store 2");
        CompletableFuture<Double> princesFutureAsync3 = service.getPrincesCompletableFutureAsync("Store 3");
        CompletableFuture<Double> princesFutureAsync4 = service.getPrincesCompletableFutureAsync("Store 4");
        long start = System.currentTimeMillis();
        try {
            System.out.println(princesFutureAsync1.get());
            System.out.println(princesFutureAsync2.get());
            System.out.println(princesFutureAsync3.get());
            System.out.println(princesFutureAsync4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time passed to seachPrincesSync " + (end - start));
        StoreService.ex.shutdown();
    }
}
