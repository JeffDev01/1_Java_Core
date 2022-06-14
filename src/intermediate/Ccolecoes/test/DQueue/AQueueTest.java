package intermediate.Ccolecoes.test.DQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class AQueueTest {
    public static void main(String[] args) {

        /*Queue é necessariamente ordenada mas necessita de Comparable ou Comparator
        * Possui o conceito FIFO, mas em cima da ordenação escolhida
        * A ordenação só é respeitada quando é chamada algum metodo em relação a isso*/
        Queue<String> alphabetQueue = new PriorityQueue<>();
        alphabetQueue.add("A");
        alphabetQueue.add("D");
        alphabetQueue.add("E");
        alphabetQueue.add("B");
        alphabetQueue.add("C");

        for (String s : alphabetQueue) {
            System.out.println(s);
        }
        System.out.println("-----------");

        //METODOS MAIS COMUNS
        /*.peek() : mostra o primeiro da lista
        * .poll() : remove o primeiro da lista assim como .remove(), a diferença esta que este nao da exception para nulos*/

        while(!alphabetQueue.isEmpty()){
            System.out.println(alphabetQueue.poll() );
        }


    }
}
