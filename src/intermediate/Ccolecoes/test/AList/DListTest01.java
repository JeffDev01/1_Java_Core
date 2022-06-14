package intermediate.Ccolecoes.test.AList;

import java.util.ArrayList;
import java.util.List;

public class DListTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Jefferson");
        nomes.add("Marcelo");
        nomes.add("Marcus");

        for (String name : nomes) {
            System.out.println(name);
        }

        System.out.println("-----------------");
        /*Foreach nao permite adicionar durante a interação, para isso devo usar "for" convencional*/
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        //ADICIONAR OBJETOS NO ARRAYLIST USANDO FOR
        System.out.println("-----------------");
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            nomes.add(i, "OVO");
            System.out.println(nomes.get(i));
        }

        //REMOVENDO OBJETOS DURANTE FOR
        for (int i = 0; i < size; i++) {
            if (!nomes.get(i).equals(null)) {
                nomes.remove(i);
                System.out.println("Vereficação: "+nomes.get(i));
            }
        }

        System.out.println("-----------------");
        List<String> names2 = new ArrayList<>();
        names2.addAll(nomes);
        for(String name: names2){
            System.out.println(name);
        }


    }
}
