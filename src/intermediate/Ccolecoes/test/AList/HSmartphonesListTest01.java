package intermediate.Ccolecoes.test.AList;

import intermediate.Ccolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class HSmartphonesListTest01 {
    public static void main(String[] args) {

        Smartphone s1 =new Smartphone("142A5", "Xiaomi");
        Smartphone s2 =new Smartphone("154V6", "Iphone");
        Smartphone s3 =new Smartphone("741A5", "Motorola");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        //PROCURANCO UM OBJETO DENTRO DE UMA ArrayList
        Smartphone s4 =new Smartphone("741A5", "LG");
        System.out.println(smartphones.contains(s4));/*Diz se contem*/

        int indexOf = smartphones.indexOf(s4); /*Se for -1 quer dizer que nao contem*/
        if(indexOf!=-1) {
            System.out.println(smartphones.get(indexOf));
        }





    }
}
