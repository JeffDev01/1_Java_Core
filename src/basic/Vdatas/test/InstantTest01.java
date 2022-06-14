package basic.Vdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        /*Sempre usado quando salva data no banco de dados, utilizando uma zona horaria neutra*/
        Instant now = Instant.now();/*Esse objeto é imutável.*/
        System.out.println(now); //ZuluTime, horario neutro do mundo.
        System.out.println(LocalDateTime.now());
    }



}
