package basic.Oclassesabstratas.test;

import basic.Oclassesabstratas.classes.Funcionario;
import basic.Oclassesabstratas.classes.Gerente;
import basic.Oclassesabstratas.classes.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {
        Gerente g = new Gerente("Anna","3333",2000);
        Vendedor v = new Vendedor("Marcus", "2222",2000, 350);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println(v);

    }

}
