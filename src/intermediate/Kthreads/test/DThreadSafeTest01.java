package intermediate.Kthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
//    private final List<String> names = Collections.synchronizedList(new ArrayList<>());
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name){
        names.add(name);
    }

    /*NESSE CASO ESSE MÉTODO ESTÁ ACIMA DA THREADSAFE, PORTANTO NAO ESTÁ PROTEGIDO.*/
    public synchronized void removeFirst(){
        if(names.size()>0){
            System.out.println(names.remove(0));
        }
    }
}

public class DThreadSafeTest01 {

    public static void main(String[] args) {

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Lucas");

        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();

    }
}
