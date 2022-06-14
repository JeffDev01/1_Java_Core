package intermediate.Kthreads.test;

import java.util.concurrent.*;

public class JFutureTest01 {

    /*FUTURE é uma interface que é responsável por declarar o método submit que irá passar o resultado de uma Thread
    * Calleble caso a mesma seja finalizada com sucesso.*/

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                return 5.35D;
            }
        });
        System.out.println(doSomething());
        /*Posso limitar o tempo de espera e lançar uma excessão caso necessário*/
        /*Mas tenho que tratar a exception pq se nao a thread nunca irá executar a shutdown*/
        try {
            System.out.println(dollarRequest.get(2, TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
        executorService.shutdown();
    }


    private static long doSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum =0;
        for(int i=0;i<1_000_000; i++){
            sum+=i;
        }
        return sum;
    }
}
