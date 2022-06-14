package basic.Qpolimorfismo.test;

import basic.Qpolimorfismo.classes.Funcionario;
import basic.Qpolimorfismo.classes.Gerente;
import basic.Qpolimorfismo.classes.RelatorioPagamento;
import basic.Qpolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Marcelo", 5000, 2000);
        Vendedor v = new Vendedor("Rodrigo", 2000, 20000);

        RelatorioPagamento relatorio = new RelatorioPagamento();

//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("------------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("------------------------");
        relatorio.relatorioPagamentoGenerico(v);



    }
}
