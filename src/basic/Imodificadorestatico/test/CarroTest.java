package basic.Imodificadorestatico.test;

import basic.Imodificadorestatico.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 250);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro(" Audi",240);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        System.out.println("#####################");

        Carro.setVelocidadeLimite(200);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();


    }


}
