package basic.Fsobrecargametodos.test;

import basic.Fsobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Marcelo");

        funcionario1.init("Jefferson","38283887874", 2800);

        funcionario1.imprimi();

    }

}
