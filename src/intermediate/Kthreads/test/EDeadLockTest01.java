package intermediate.Kthreads.test;

public class EDeadLockTest01 {
    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();


        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1 : Holding lock 1");
                System.out.println("Thread 1 : Waiting lock 2");
                synchronized (lock2){
                    System.out.println("Thread 2: Holding lock 2");
                    System.out.println("Thread 2: Holding lock 1");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock1){/*Troquei a otdem aqui para lock1 -> lock2 para evitar o deadLock*/
                System.out.println("Thread 2 : Holding lock 2");
                System.out.println("Thread 2 : Waiting lock 1");
                synchronized (lock2){
                    System.out.println("Thread 1: Holding lock 1");

                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

    }
}
