package intermediate.Lconcurrency.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//CONCURRENT.ATOMICS CLASSES
/*Quando trabalhamos com threads e usamos métodos de classes utilitárioas, por tras do código pode ocorrer que algum método nao implemente
* syscronized, fazendo com que o resultado seja perdido. Para nao ter que bloquear os objetos dentro de syncronized
* é possivel nesse caso usar o AtomicInteger para esse exemplo*/
/*Essa é uma forma portanto de nao ter que se preocupar tanto com ficar fazendo manualmente syncronizando os objetos em
* todas as implementações. Esse é algo que veio junto com o desenvolveimento da Concurrency Utilities.*/

class Counter {
    private int count;
    private AtomicInteger atomicInteger= new AtomicInteger();
    private final Lock lock = new ReentrantLock();

    void incremente(){
        count ++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {

    public static void main(String[] args) throws InterruptedException {
            Counter counter = new Counter();
            Runnable r = () ->{
                 for(int i =0; i<10000; i++){
                     counter.incremente();
                 }
            };


        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());

    }
}
