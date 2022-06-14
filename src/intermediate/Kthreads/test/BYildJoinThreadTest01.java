package intermediate.Kthreads.test;

public class BYildJoinThreadTest01 implements Runnable{

    //YIELD E JOIN SÃO MÉTODOS STATICOS QUE TENTAM FORÇAR A ORDENAÇÃO DA EXECUÇÃO DAS THREADS.
    private final char d;

    public BYildJoinThreadTest01(char d) {
        this.d = d;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BYildJoinThreadTest01('A'));
        Thread t2 = new Thread(new BYildJoinThreadTest01('B'));
        t1.start();
        t1.join();
        t2.start();

        System.out.println("############ "+Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(d);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
            /*yield() é uma tentativa de deixar outras threads de mesma prioridade ou superir passar na frente. Mas mesmo
            * assim isso não é garantido. Esse metodo não é muito usado e se for deve ser acombanhado por benchMark*/

        }
    }
}
