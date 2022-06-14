package basic.Cclassesobjects.testes;

import basic.Cclassesobjects.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();


        carro1.modelo = "Ferrari";
        carro1.velocidadeMaxima = 280;
        carro1.placa = "HEL-3028";

        System.out.println(carro1.modelo);
        System.out.println(carro1.placa);
        System.out.println(carro1.velocidadeMaxima);

    }


}
