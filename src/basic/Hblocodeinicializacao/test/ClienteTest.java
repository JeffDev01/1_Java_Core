package basic.Hblocodeinicializacao.test;

import basic.Hblocodeinicializacao.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();

        System.out.println("\nExibindo quantidades de parcelas: ");

        for( int parcela : c1.getParcelas()){
            System.out.print(parcela+ " ");
        }



    }





}
