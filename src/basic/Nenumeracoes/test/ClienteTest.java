package basic.Nenumeracoes.test;

import basic.Nenumeracoes.classes.Cliente;
import basic.Nenumeracoes.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Leandro", TipoCliente.PESSOA_FISICA , Cliente.TipoPagamento.APRAZO);
        Cliente c2 = new Cliente("Marcelo",TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);

        System.out.println(c2);


    }
}
