package basic.Imodificadorestatico.test;

import basic.Imodificadorestatico.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println("\nExibindo quantidades de parcelas: ");

//        for( int parcela : c1.getParcelas()){
//            System.out.print(parcela+ " ");
//        }

        System.out.print("tamanho: "+ Cliente.getParcelas().length);



    }





}
