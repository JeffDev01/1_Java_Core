package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1= new Carro();
        carro1.marca ="Fiat";
        carro1.modelo="Uno";
        carro1.placa="BTR-0220";

        carro1.imprimirDados();
        System.out.println("---------------------");//Como o método nao tem retorno o valor dessa variável será a que estiver nessa classe
        System.out.println(carro1.marca);



    }

}
