package intermediate.Kthreads.test;

public class ACreatingThreadTest01 {

    //INTRODUÇÃO A THREAD

    /*TIPOS DE THREADS:
     * Daemon: Thread que funciona em segundo plano dando suporte e serviços para as threads user.  Como por exemplo elas
     * funcionam como serviços no windowns. Elas possuem baixa prioridade para a JVM, e uma vez finalizadas todas as threads
     * user, mesmo que ainda reste daemons a JVM encerra a plicação.
     * User: Threads principais da aplicação, de alta prioridade e que a aplicação do é encerrada quando todas as threads
     * user terminarem.
     *
     *JVM cuida da sequência de execução das threads*/

    public static void main(String[] args) {

        //CRIANDO UMA THREAD: EXISTEM 2 MANEIRAS PRINCIPAIS

        //PRIMEIRA
//        ThreadExemple t1 = new ThreadExemple('A');
//        ThreadExemple t2 = new ThreadExemple('B');
//        ThreadExemple t3 = new ThreadExemple('C');
//        ThreadExemple t4 = new ThreadExemple('D');
        /*Desse modo .run() estou jogando a responsabilidade de executar essas threads para a thread main, portanto irá executar
         * em sequência*/
//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

        //SEGUNDA
        Thread t1 = new Thread(new ThreadExempleRunnable('A'), "Thread da Letra A");
        Thread t2 = new Thread(new ThreadExempleRunnable('B'), "Thread da Letra B");
        Thread t3 = new Thread(new ThreadExempleRunnable('C'), "Thread da Letra C");
        Thread t4 = new Thread(new ThreadExempleRunnable('D'), "Thread da Letra D");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}

//PRIMEIRA: CRIAR UMA CLASSE EXTENDS A CLASSE THREAD E OVERRIDE O METODO RUN: Ctrl+O
class ThreadExemple extends Thread {
    private final char c;

    public ThreadExemple(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

        }
    }
}

//SEGUNDA: CRIAR UMA CLASSE QUE IMPLEMENTS RUNNABLE, O QUAL JÁ POSSUI UM MÉTODO FUNCIONSINGLE PARA ISSO
class ThreadExempleRunnable implements Runnable {

    private final char d;

    public ThreadExempleRunnable(char d) {
        this.d = d;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(d);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

