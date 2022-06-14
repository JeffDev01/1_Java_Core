package basic.Kheranca.test;

import basic.Kheranca.classes.Funcionario;
import basic.Kheranca.classes.Pessoa;

public class HerancaTest {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jefferson");
        p1.setNome("Lucas");
        p1.setEndereco("Brasil");
        p1.setCpf("88888888");
        p1.imprime();

        System.out.println("--------------------------------");

        Funcionario f1 = new Funcionario("Jefferson");
        f1.setNome("João");
        f1.setEndereco("Malasia");
        f1.setCpf("33333333");
        f1.setSalario(1000);
        f1.imprime();



    }


}
