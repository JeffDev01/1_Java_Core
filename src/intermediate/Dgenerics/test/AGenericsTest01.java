package intermediate.Dgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class AGenericsTest01 {
    public static void main(String[] args) {

        /*Versões anteriores as listas aceitavam qualquer tipo de objeto. Para melhorar performance e evitar bugs
        * foi introduzido a forma generics <type> para que podesse obrigar a incersão de apenas um tipo de objeto
        * nas listas. Portanto generics só é reconhecido em tempo de execução*/

        List list = new ArrayList();
        list.add(123);
        list.add("Jefferson");

        for (Object o : list) {
            System.out.println(o);
        }
    }

}
