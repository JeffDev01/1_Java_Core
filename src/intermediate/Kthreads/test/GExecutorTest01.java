package intermediate.Kthreads.test;

import java.util.concurrent.*;

class Printer implements Runnable {

    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s start: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finished%n", Thread.currentThread().getName(), num);

    }
}

public class GExecutorTest01 {
    public static void main(String[] args) {
        //MOSTRA O NUMEROS DE NUCLEOS DE PROCESSAMENTOS.
//        System.out.println(Runtime.getRuntime().availableProcessors());

        //COLOCAR UM NÚMERO FIXO DE THREADS
        /*Independete da tarefa posso fixar o numero de threads para lidar com a tarefa selecionada, entretanto devemos
         * sempre analizar com banchmark pra ver se isso irá melhorar a performance ou piorar.*/
//        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //SEMPRE USANDO A QUANTIDADE MÁXIMA DE THREADS QUE O PROCESSADOR SUPORTA
//        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        //APENAS UMA UNICA THREAD
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //CACHEDTHREAD GERENCIA POR CONTA A QUANTIDADE DE THREADS CRIADAS E AS ELIMINA DO CACHED SE NAO UTILIZADA
        ExecutorService executorService = Executors.newCachedThreadPool();

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));

        /*Se eu tiver mais tarefas para outras intancias o Executor vai reutilizar as threads criadas*/
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));

        /*Retorna um numero aproximado de threads sendo executadas*/
        System.out.println(threadPoolExecutor.getActiveCount());


        executorService.shutdown();/*Finaliza as threads criadas pelo executorService.*/


    }

}
