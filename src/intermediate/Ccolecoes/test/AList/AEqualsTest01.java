package intermediate.Ccolecoes.test.AList;

import intermediate.Ccolecoes.domain.Smartphone;

public class AEqualsTest01 {

    public static void main(String[] args) {

        /*O método equal compara valores reference, portando entre dois objetos mesmo com conteúdo iguais irá ser false
        * portanto para dizer que dois objetos sao iguais tenho que passar a reference de um para o outro antes*/
        Smartphone s1 =new Smartphone("142A5", "Xiaomi");
        Smartphone s2 =new Smartphone("142A5", "Xiaomi");
        System.out.println(s1.equals(s2));

        Smartphone s3 =new Smartphone("142A5", "Xiaomi");
        Smartphone s4 =s3;
        System.out.println(s3.equals(s4));


    }


}
