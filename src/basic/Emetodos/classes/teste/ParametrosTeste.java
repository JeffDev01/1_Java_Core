package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.MetodosComParametros;

public class ParametrosTeste {

    public static void main(String[] args) {

        MetodosComParametros calc = new MetodosComParametros();
        int num1 = 5;
        int num2 = 20;
        calc.aleteraDoisNumeros(num1,num2 );

        System.out.println("Dentro do main");
        System.out.println("num1: "+num1+" num2: "+num2);



    }

}
